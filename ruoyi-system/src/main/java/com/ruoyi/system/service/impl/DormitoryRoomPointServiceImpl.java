package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.bean.BeanValidators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DormitoryRoomPointMapper;
import com.ruoyi.system.domain.DormitoryRoomPoint;
import com.ruoyi.system.service.IDormitoryRoomPointService;

/**
 * 宿舍卫生评分Service业务层处理
 * 
 * @author 朱鸿斌
 * @date 2022-04-28
 */
@Service
public class DormitoryRoomPointServiceImpl implements IDormitoryRoomPointService 
{
    @Autowired
    private DormitoryRoomPointMapper dormitoryRoomPointMapper;

    /**
     * 查询宿舍卫生评分
     * 
     * @param dormitoryId 宿舍卫生评分主键
     * @return 宿舍卫生评分
     */
    @Override
    public DormitoryRoomPoint selectDormitoryRoomPointByDormitoryId(String dormitoryId)
    {
        return dormitoryRoomPointMapper.selectDormitoryRoomPointByDormitoryId(dormitoryId);
    }

    /**
     * 查询宿舍卫生评分列表
     * 
     * @param dormitoryRoomPoint 宿舍卫生评分
     * @return 宿舍卫生评分
     */
    @Override
    public List<DormitoryRoomPoint> selectDormitoryRoomPointList(DormitoryRoomPoint dormitoryRoomPoint)
    {

        return dormitoryRoomPointMapper.selectDormitoryRoomPointList(dormitoryRoomPoint);
    }

    /**
     * 新增宿舍卫生评分
     * 
     * @param dormitoryRoomPoint 宿舍卫生评分
     * @return 结果
     */
    @Override
    public int insertDormitoryRoomPoint(DormitoryRoomPoint dormitoryRoomPoint)
    {
        dormitoryRoomPointMapper.insertDormitoryRoomPoint(dormitoryRoomPoint);
        int count = dormitoryRoomPointMapper.selectDormitoryRoomPointCount();
        int sum = dormitoryRoomPointMapper.selectDormitoryRoomPointSum();
        int a = sum/count;
        return dormitoryRoomPointMapper.updateDormitoryRoomPointAvgPoint(a);
    }

    /**
     * 修改宿舍卫生评分
     * 
     * @param dormitoryRoomPoint 宿舍卫生评分
     * @return 结果
     */
    @Override
    public int updateDormitoryRoomPoint(DormitoryRoomPoint dormitoryRoomPoint)
    {
        dormitoryRoomPointMapper.updateDormitoryRoomPoint(dormitoryRoomPoint);
        int count = dormitoryRoomPointMapper.selectDormitoryRoomPointCount();
        int sum = dormitoryRoomPointMapper.selectDormitoryRoomPointSum();
        int a = sum/count;
        return dormitoryRoomPointMapper.updateDormitoryRoomPointAvgPoint(a);
    }

    /**
     * 批量删除宿舍卫生评分
     * 
     * @param dormitoryIds 需要删除的宿舍卫生评分主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryRoomPointByDormitoryIds(String[] dormitoryIds)
    {
        dormitoryRoomPointMapper.deleteDormitoryRoomPointByDormitoryIds(dormitoryIds);
        int count = dormitoryRoomPointMapper.selectDormitoryRoomPointCount();
        int sum = dormitoryRoomPointMapper.selectDormitoryRoomPointSum();
        int a = sum/count;
        return dormitoryRoomPointMapper.updateDormitoryRoomPointAvgPoint(a);
    }

    /**
     * 删除宿舍卫生评分信息
     * 
     * @param dormitoryId 宿舍卫生评分主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryRoomPointByDormitoryId(String dormitoryId)
    {
        return dormitoryRoomPointMapper.deleteDormitoryRoomPointByDormitoryId(dormitoryId);
    }

    /**
     * 导入用户数据
     *
     * @param userList 用户数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @param operName 操作用户
     * @return 结果
     */
    @Override
    public String importUser(List<DormitoryRoomPoint> userList, Boolean isUpdateSupport, String operName)
    {
        if (StringUtils.isNull(userList) || userList.size() == 0)
        {
            throw new ServiceException("导入用户数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        for (DormitoryRoomPoint user : userList)
        {
            try
            {
                // 验证是否存在这个用户
                int u = dormitoryRoomPointMapper.selectDormitoryRoomPointById(user);
                if (u==0)
                {
                    dormitoryRoomPointMapper.insertDormitoryRoomPoint(user);
                    successNum++;
                    successMsg.append("<br/>" + successNum +' '+ user.getDormitoryId()+"房间卫生评分插入成功!");
                }
                else if (isUpdateSupport)
                {

                    dormitoryRoomPointMapper.updateDormitoryRoomPointById(user);
                    successNum++;
                    successMsg.append("<br/>" + successNum +' ' +user.getDormitoryId()+"房间卫生评分修改成功");
                }
                else
                {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum +' '+ user.getDormitoryId()+"房间信息已存在");
                }
            }
            catch (Exception e)
            {
                failureNum++;
                String msg = "<br/>" + failureNum + "导入失败：";
                failureMsg.append(msg + e.getMessage());
            }
        }
        if (failureNum > 0)
        {
            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
            throw new ServiceException(failureMsg.toString());
        }
        else
        {
            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
        }
        return successMsg.toString();
    }
}
