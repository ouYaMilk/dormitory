package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DormitoryRepair;

/**
 * 宿舍维修管理Mapper接口
 * 
 * @author zhb
 * @date 2022-01-07
 */
public interface DormitoryRepairMapper 
{
    /**
     * 查询宿舍维修管理
     * 
     * @param repairId 宿舍维修管理主键
     * @return 宿舍维修管理
     */
    public DormitoryRepair selectDormitoryRepairByRepairId(Long repairId);

    /**
     * 查询宿舍号是否有效
     * @param dormitoryId
     * @return
     */
    public int selectDormitoryRePairByDormitoryId(String dormitoryId);

    /**
     * 验证身份是否存在
     * @param stuName
     * @return
     */
    public int selectDormitoryRePairByStuName(String stuName);
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
    public int insertDormitoryRepair(DormitoryRepair dormitoryRepair);

    /**
     * 修改宿舍维修管理
     * 
     * @param dormitoryRepair 宿舍维修管理
     * @return 结果
     */
    public int updateDormitoryRepair(DormitoryRepair dormitoryRepair);

    /**
     * 宿舍接受指派
     *
     * @param dormitoryRepair 宿舍维修管理
     * @return
     */
    public int updateDormitoryRepairByName(DormitoryRepair dormitoryRepair);

    /**
     * 删除宿舍维修管理
     * 
     * @param repairId 宿舍维修管理主键
     * @return 结果
     */
    public int deleteDormitoryRepairByRepairId(Long repairId);

    /**
     * 批量删除宿舍维修管理
     * 
     * @param repairIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDormitoryRepairByRepairIds(Long[] repairIds);
}
