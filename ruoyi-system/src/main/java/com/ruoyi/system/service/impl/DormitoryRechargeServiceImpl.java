package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DormitoryRechargeMapper;
import com.ruoyi.system.domain.DormitoryRecharge;
import com.ruoyi.system.service.IDormitoryRechargeService;

/**
 * 宿舍充值管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-01-07
 */
@Service
public class DormitoryRechargeServiceImpl implements IDormitoryRechargeService 
{
    @Autowired
    private DormitoryRechargeMapper dormitoryRechargeMapper;

    /**
     * 查询宿舍充值管理
     * 
     * @param rechargeId 宿舍充值管理主键
     * @return 宿舍充值管理
     */
    @Override
    public DormitoryRecharge selectDormitoryRechargeByRechargeId(Long rechargeId)
    {
        return dormitoryRechargeMapper.selectDormitoryRechargeByRechargeId(rechargeId);
    }

    /**
     * 查询宿舍充值管理列表
     * 
     * @param dormitoryRecharge 宿舍充值管理
     * @return 宿舍充值管理
     */
    @Override
    public List<DormitoryRecharge> selectDormitoryRechargeList(DormitoryRecharge dormitoryRecharge)
    {
        return dormitoryRechargeMapper.selectDormitoryRechargeList(dormitoryRecharge);
    }

    /**
     * 新增宿舍充值管理
     * 
     * @param dormitoryRecharge 宿舍充值管理
     * @return 结果
     */
    @Override
    public AjaxResult insertDormitoryRecharge(DormitoryRecharge dormitoryRecharge)
    {
        String dormitoryId = dormitoryRecharge.getDormitoryId();
        int j = dormitoryRechargeMapper.selectDormitoryRechargeByDormitoryId(dormitoryId);
        if (j == 0) {
            return AjaxResult.error("此为无效宿舍号");
        }
        long stuId = dormitoryRecharge.getStuId();
        int i = dormitoryRechargeMapper.selectDormitoryRechargeByStuId(stuId);
        if (i == 0) {
            return AjaxResult.error("此为无效学号");
        }

        return AjaxResult.success(dormitoryRechargeMapper.insertDormitoryRecharge(dormitoryRecharge));
    }

    /**
     * 修改宿舍充值管理
     * 
     * @param dormitoryRecharge 宿舍充值管理
     * @return 结果
     */
    @Override
    public int updateDormitoryRecharge(DormitoryRecharge dormitoryRecharge)
    {
        return dormitoryRechargeMapper.updateDormitoryRecharge(dormitoryRecharge);
    }

    /**
     * 批量删除宿舍充值管理
     * 
     * @param rechargeIds 需要删除的宿舍充值管理主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryRechargeByRechargeIds(Long[] rechargeIds)
    {
        return dormitoryRechargeMapper.deleteDormitoryRechargeByRechargeIds(rechargeIds);
    }

    /**
     * 删除宿舍充值管理信息
     * 
     * @param rechargeId 宿舍充值管理主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryRechargeByRechargeId(Long rechargeId)
    {
        return dormitoryRechargeMapper.deleteDormitoryRechargeByRechargeId(rechargeId);
    }
}
