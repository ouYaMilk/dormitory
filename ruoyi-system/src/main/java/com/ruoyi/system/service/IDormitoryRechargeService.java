package com.ruoyi.system.service;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.DormitoryRecharge;

/**
 * 宿舍充值管理Service接口
 * 
 * @author ruoyi
 * @date 2022-01-07
 */
public interface IDormitoryRechargeService 
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
     * 新增宿舍充值管理
     * 
     * @param dormitoryRecharge 宿舍充值管理
     * @return 结果
     */
    public AjaxResult insertDormitoryRecharge(DormitoryRecharge dormitoryRecharge);

    /**
     * 修改宿舍充值管理
     * 
     * @param dormitoryRecharge 宿舍充值管理
     * @return 结果
     */
    public int updateDormitoryRecharge(DormitoryRecharge dormitoryRecharge);

    /**
     * 批量删除宿舍充值管理
     * 
     * @param rechargeIds 需要删除的宿舍充值管理主键集合
     * @return 结果
     */
    public int deleteDormitoryRechargeByRechargeIds(Long[] rechargeIds);

    /**
     * 删除宿舍充值管理信息
     * 
     * @param rechargeId 宿舍充值管理主键
     * @return 结果
     */
    public int deleteDormitoryRechargeByRechargeId(Long rechargeId);
}
