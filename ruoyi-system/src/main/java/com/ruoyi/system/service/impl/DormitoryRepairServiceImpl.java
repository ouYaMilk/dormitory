package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.system.mapper.DormitoryRepairAcceptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DormitoryRepairMapper;
import com.ruoyi.system.domain.DormitoryRepair;
import com.ruoyi.system.service.IDormitoryRepairService;

/**
 * 宿舍维修管理Service业务层处理
 * 
 * @author zhb
 * @date 2022-01-07
 */
@Service
public class DormitoryRepairServiceImpl implements IDormitoryRepairService 
{
    @Autowired
    private DormitoryRepairMapper dormitoryRepairMapper;

    @Autowired
    private DormitoryRepairAcceptMapper dormitoryRepairAcceptMapper;

    /**
     * 查询宿舍维修管理
     * 
     * @param repairId 宿舍维修管理主键
     * @return 宿舍维修管理
     */
    @Override
    public DormitoryRepair selectDormitoryRepairByRepairId(Long repairId)
    {
        return dormitoryRepairMapper.selectDormitoryRepairByRepairId(repairId);
    }

    /**
     * 查询宿舍维修管理列表
     * 
     * @param dormitoryRepair 宿舍维修管理
     * @return 宿舍维修管理
     */
    @Override
    public List<DormitoryRepair> selectDormitoryRepairList(DormitoryRepair dormitoryRepair)
    {
        return dormitoryRepairMapper.selectDormitoryRepairList(dormitoryRepair);
    }

    /**
     * 新增宿舍维修管理
     * 
     * @param dormitoryRepair 宿舍维修管理
     * @return 结果
     */
    @Override
    public AjaxResult insertDormitoryRepair(DormitoryRepair dormitoryRepair)
    {
        String dormitoryId = dormitoryRepair.getDormitoryId();
        int i = dormitoryRepairMapper.selectDormitoryRePairByDormitoryId(dormitoryId);
        if (i == 0) {
            return AjaxResult.error("此为无效宿舍号");
        }
        String stuName = dormitoryRepair.getStuName();
        int j = dormitoryRepairMapper.selectDormitoryRePairByStuName(stuName);
        if (j == 0) {
            return AjaxResult.error("学生信息不存在");
        }
        return AjaxResult.success(dormitoryRepairMapper.insertDormitoryRepair(dormitoryRepair));
    }

    /**
     * 修改宿舍维修管理
     * 
     * @param dormitoryRepair 宿舍维修管理
     * @return 结果
     */
    @Override
    public int updateDormitoryRepair(DormitoryRepair dormitoryRepair)
    {
        return dormitoryRepairMapper.updateDormitoryRepair(dormitoryRepair);
    }


    /**
     * 任务指派
     *
     * @param dormitoryRepair 宿舍维修管理
     * @return
     */
    @Override
    public int updateDormitoryRepairByName(DormitoryRepair dormitoryRepair)
    {
        dormitoryRepair.setRepairerName(SecurityUtils.getUsername());
        dormitoryRepairAcceptMapper.insertDormitoryRepairAccept(dormitoryRepair);
        return dormitoryRepairMapper.updateDormitoryRepairByName(dormitoryRepair);
    }

    /**
     * 批量删除宿舍维修管理
     * 
     * @param repairIds 需要删除的宿舍维修管理主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryRepairByRepairIds(Long[] repairIds)
    {
        return dormitoryRepairMapper.deleteDormitoryRepairByRepairIds(repairIds);
    }

    /**
     * 删除宿舍维修管理信息
     * 
     * @param repairId 宿舍维修管理主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryRepairByRepairId(Long repairId)
    {
        return dormitoryRepairMapper.deleteDormitoryRepairByRepairId(repairId);
    }
}
