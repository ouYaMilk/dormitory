package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DormitoryRecharge;

/**
 * 宿舍充值管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-01-07
 */
public interface DormitoryRechargeMapper 
{
    /**
     * 查询宿舍充值管理
     * 
     * @param rechargeId 宿舍充值管理主键
     * @return 宿舍充值管理
     */
    public DormitoryRecharge selectDormitoryRechargeByRechargeId(Long rechargeId);

    /**
     * 查询宿舍充值管理列表
     * 
     * @param dormitoryRecharge 宿舍充值管理
     * @return 宿舍充值管理集合
     */
    public List<DormitoryRecharge> selectDormitoryRechargeList(DormitoryRecharge dormitoryRecharge);

    /**
     * 查询学号是否有效
     * @param dormitoryRecharge
     * @return
     */
    public int selectDormitoryRechargeByStuId(Long stuId);

    /**
     * 查询宿舍号是否有效
     * @param dormitoryId
     * @return
     */
    public int selectDormitoryRechargeByDormitoryId(String dormitoryId);
    /**
     * 新增宿舍充值管理
     * 
     * @param dormitoryRecharge 宿舍充值管理
     * @return 结果
     */
    public int insertDormitoryRecharge(DormitoryRecharge dormitoryRecharge);

    /**
     * 修改宿舍充值管理
     * 
     * @param dormitoryRecharge 宿舍充值管理
     * @return 结果
     */
    public int updateDormitoryRecharge(DormitoryRecharge dormitoryRecharge);

    /**
     * 删除宿舍充值管理
     * 
     * @param rechargeId 宿舍充值管理主键
     * @return 结果
     */
    public int deleteDormitoryRechargeByRechargeId(Long rechargeId);

    /**
     * 批量删除宿舍充值管理
     * 
     * @param rechargeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDormitoryRechargeByRechargeIds(Long[] rechargeIds);
}
