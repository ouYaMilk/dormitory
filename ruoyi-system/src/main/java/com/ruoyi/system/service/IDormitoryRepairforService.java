package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DormitoryRepairfor;

/**
 * 宿舍维修管理Service接口
 * 
 * @author 朱鸿斌
 * @date 2022-02-15
 */
public interface IDormitoryRepairforService 
{
    /**
     * 查询宿舍维修管理
     * 
     * @param repairFid 宿舍维修管理主键
     * @return 宿舍维修管理
     */
    public DormitoryRepairfor selectDormitoryRepairforByRepairFid(Long repairFid);

    /**
     * 查询宿舍维修管理列表
     * 
     * @param dormitoryRepairfor 宿舍维修管理
     * @return 宿舍维修管理集合
     */
    public List<DormitoryRepairfor> selectDormitoryRepairforList(DormitoryRepairfor dormitoryRepairfor);

//    /**
//     * 新增宿舍维修管理
//     *
//     * @param dormitoryRepairfor 宿舍维修管理
//     * @return 结果
//     */
//    public int insertDormitoryRepairfor(DormitoryRepairfor dormitoryRepairfor);

    /**
     * 修改宿舍维修管理
     * 
     * @param dormitoryRepairfor 宿舍维修管理
     * @return 结果
     */
    public int updateDormitoryRepairfor(DormitoryRepairfor dormitoryRepairfor);

    /**
     * 批量删除宿舍维修管理
     * 
     * @param repairFids 需要删除的宿舍维修管理主键集合
     * @return 结果
     */
    public int deleteDormitoryRepairforByRepairFids(Long[] repairFids);

    /**
     * 删除宿舍维修管理信息
     * 
     * @param repairFid 宿舍维修管理主键
     * @return 结果
     */
    public int deleteDormitoryRepairforByRepairFid(Long repairFid);
}
