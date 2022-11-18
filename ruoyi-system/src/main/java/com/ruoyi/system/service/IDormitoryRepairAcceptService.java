package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DormitoryRepairAccept;

/**
 * 任务指派Service接口
 * 
 * @author 朱鸿斌
 * @date 2022-04-27
 */
public interface IDormitoryRepairAcceptService 
{
    /**
     * 查询任务指派
     * 
     * @param acceptRepairId 任务指派主键
     * @return 任务指派
     */
    public DormitoryRepairAccept selectDormitoryRepairAcceptByAcceptRepairId(Long acceptRepairId);

    /**
     * 查询任务指派列表
     * 
     * @param dormitoryRepairAccept 任务指派
     * @return 任务指派集合
     */
    public List<DormitoryRepairAccept> selectDormitoryRepairAcceptList(DormitoryRepairAccept dormitoryRepairAccept);
//
//    /**
//     * 新增任务指派
//     *
//     * @param dormitoryRepairAccept 任务指派
//     * @return 结果
//     */
//    public int insertDormitoryRepairAccept(DormitoryRepairAccept dormitoryRepairAccept);

    /**
     * 修改任务指派
     * 
     * @param dormitoryRepairAccept 任务指派
     * @return 结果
     */
    public int updateDormitoryRepairAccept(DormitoryRepairAccept dormitoryRepairAccept);

    /**
     * 批量删除任务指派
     * 
     * @param acceptRepairIds 需要删除的任务指派主键集合
     * @return 结果
     */
    public int deleteDormitoryRepairAcceptByAcceptRepairIds(Long[] acceptRepairIds);

    /**
     * 删除任务指派信息
     * 
     * @param acceptRepairId 任务指派主键
     * @return 结果
     */
    public int deleteDormitoryRepairAcceptByAcceptRepairId(Long acceptRepairId);
}
