package com.ruoyi.system.service;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.DormitoryRepair;

/**
 * 宿舍维修管理Service接口
 * 
 * @author zhb
 * @date 2022-01-07
 */
public interface IDormitoryRepairService 
{
    /**
     * 查询宿舍维修管理
     * 
     * @param repairId 宿舍维修管理主键
     * @return 宿舍维修管理
     */
    public DormitoryRepair selectDormitoryRepairByRepairId(Long repairId);

    /**
     * 查询宿舍维修管理列表
     * 
     * @param dormitoryRepair 宿舍维修管理
     * @return 宿舍维修管理集合
     */
    public List<DormitoryRepair> selectDormitoryRepairList(DormitoryRepair dormitoryRepair);

    /**
     * 新增宿舍维修管理
     * 
     * @param dormitoryRepair 宿舍维修管理
     * @return 结果
     */
    public AjaxResult insertDormitoryRepair(DormitoryRepair dormitoryRepair);

    /**
     * 修改宿舍维修管理
     * 
     * @param dormitoryRepair 宿舍维修管理
     * @return 结果
     */
    public int updateDormitoryRepair(DormitoryRepair dormitoryRepair);

    /**
     * 接受指派增加name
     *
     * @param dormitoryRepair 宿舍维修管理
     * @return
     */
    public int updateDormitoryRepairByName(DormitoryRepair dormitoryRepair);

    /**
     * 批量删除宿舍维修管理
     * 
     * @param repairIds 需要删除的宿舍维修管理主键集合
     * @return 结果
     */
    public int deleteDormitoryRepairByRepairIds(Long[] repairIds);

    /**
     * 删除宿舍维修管理信息
     * 
     * @param repairId 宿舍维修管理主键
     * @return 结果
     */
    public int deleteDormitoryRepairByRepairId(Long repairId);
}
