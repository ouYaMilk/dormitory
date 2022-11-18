package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DormitoryRepairforMapper;
import com.ruoyi.system.domain.DormitoryRepairfor;
import com.ruoyi.system.service.IDormitoryRepairforService;

/**
 * 宿舍维修管理Service业务层处理
 * 
 * @author 朱鸿斌
 * @date 2022-02-15
 */
@Service
public class DormitoryRepairforServiceImpl implements IDormitoryRepairforService 
{
    @Autowired
    private DormitoryRepairforMapper dormitoryRepairforMapper;

    /**
     * 查询宿舍维修管理
     * 
     * @param repairFid 宿舍维修管理主键
     * @return 宿舍维修管理
     */
    @Override
    public DormitoryRepairfor selectDormitoryRepairforByRepairFid(Long repairFid)
    {
        return dormitoryRepairforMapper.selectDormitoryRepairforByRepairFid(repairFid);
    }

    /**
     * 查询宿舍维修管理列表
     * 
     * @param dormitoryRepairfor 宿舍维修管理
     * @return 宿舍维修管理
     */
    @Override
    public List<DormitoryRepairfor> selectDormitoryRepairforList(DormitoryRepairfor dormitoryRepairfor)
    {
        return dormitoryRepairforMapper.selectDormitoryRepairforList(dormitoryRepairfor);
    }

//    /**
//     * 新增宿舍维修管理
//     *
//     * @param dormitoryRepairfor 宿舍维修管理
//     * @return 结果
//     */
//    @Override
//    public int insertDormitoryRepairfor(DormitoryRepairfor dormitoryRepairfor)
//    {
//        return dormitoryRepairforMapper.insertDormitoryRepairfor(dormitoryRepairfor);
//    }



    /**
     * 修改宿舍维修管理
     * 
     * @param dormitoryRepairfor 宿舍维修管理
     * @return 结果
     */
    @Override
    public int updateDormitoryRepairfor(DormitoryRepairfor dormitoryRepairfor)
    {
        return dormitoryRepairforMapper.updateDormitoryRepairfor(dormitoryRepairfor);
    }

    /**
     * 批量删除宿舍维修管理
     * 
     * @param repairFids 需要删除的宿舍维修管理主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryRepairforByRepairFids(Long[] repairFids)
    {
        return dormitoryRepairforMapper.deleteDormitoryRepairforByRepairFids(repairFids);
    }

    /**
     * 删除宿舍维修管理信息
     * 
     * @param repairFid 宿舍维修管理主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryRepairforByRepairFid(Long repairFid)
    {
        return dormitoryRepairforMapper.deleteDormitoryRepairforByRepairFid(repairFid);
    }
}
