package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.mapper.DormitoryRoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DormitoryMembersMapper;
import com.ruoyi.system.domain.DormitoryMembers;
import com.ruoyi.system.service.IDormitoryMembersService;

/**
 * 宿舍成员管理Service业务层处理
 * 
 * @author zhb
 * @date 2022-01-10
 */
@Service
public class DormitoryMembersServiceImpl implements IDormitoryMembersService 
{
    @Autowired
    private DormitoryMembersMapper dormitoryMembersMapper;

    @Autowired
    private DormitoryRoomMapper dormitoryRoomMapper;

    /**
     * 查询宿舍成员管理
     * 
     * @param id 宿舍成员管理主键
     * @return 宿舍成员管理
     */
    @Override
    public DormitoryMembers selectDormitoryMembersById(Long id)
    {
        return dormitoryMembersMapper.selectDormitoryMembersById(id);
    }

    /**
     * 查询宿舍成员管理列表
     * 
     * @param dormitoryMembers 宿舍成员管理
     * @return 宿舍成员管理
     */
    @Override
    public List<DormitoryMembers> selectDormitoryMembersList(DormitoryMembers dormitoryMembers)
    {
        return dormitoryMembersMapper.selectDormitoryMembersList(dormitoryMembers);
    }

    /**
     * 新增宿舍成员管理
     * 
     * @param dormitoryMembers 宿舍成员管理
     * @return 结果
     */
    @Override
    public AjaxResult insertDormitoryMembers(DormitoryMembers dormitoryMembers)
    {
        String roomId = dormitoryMembers.getDormitoryId();
        int i = dormitoryMembersMapper.selectDormitoryMembersByStuId(roomId);
        if (i == 0) {
            return AjaxResult.error("此为无效宿舍号");
        }

        return AjaxResult.success(dormitoryMembersMapper.insertDormitoryMembers(dormitoryMembers));
    }

    /**
     * 修改宿舍成员管理
     * 
     * @param dormitoryMembers 宿舍成员管理
     * @return 结果
     */
    @Override
    public AjaxResult updateDormitoryMembers(DormitoryMembers dormitoryMembers)
    {

        int num = dormitoryRoomMapper.selectDormitoryRoomNum(dormitoryMembers);
        if(num<=4){
        return AjaxResult.success(dormitoryMembersMapper.updateDormitoryMembers(dormitoryMembers));
        }
        else {
            return AjaxResult.error("宿舍人数已满");
        }
    }

    /**
     * 批量删除宿舍成员管理
     * 
     * @param ids 需要删除的宿舍成员管理主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryMembersByIds(Long[] ids)
    {
        return dormitoryMembersMapper.deleteDormitoryMembersByIds(ids);
    }

    /**
     * 删除宿舍成员管理信息
     * 
     * @param id 宿舍成员管理主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryMembersById(Long id)
    {
        return dormitoryMembersMapper.deleteDormitoryMembersById(id);
    }
}
