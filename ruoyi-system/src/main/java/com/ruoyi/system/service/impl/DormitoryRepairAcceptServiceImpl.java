package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.mapper.DormitoryRepairforMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DormitoryRepairAcceptMapper;
import com.ruoyi.system.domain.DormitoryRepairAccept;
import com.ruoyi.system.service.IDormitoryRepairAcceptService;

/**
 * 任务指派Service业务层处理
 * 
 * @author 朱鸿斌
 * @date 2022-04-27
 */
@Service
public class DormitoryRepairAcceptServiceImpl implements IDormitoryRepairAcceptService 
{
    @Autowired
    private DormitoryRepairAcceptMapper dormitoryRepairAcceptMapper;

    @Autowired
    private DormitoryRepairforMapper dormitoryRepairforMapper;

    /**
     * 查询任务指派
     * 
     * @param acceptRepairId 任务指派主键
     * @return 任务指派
     */
    @Override
    public DormitoryRepairAccept selectDormitoryRepairAcceptByAcceptRepairId(Long acceptRepairId)
    {
        return dormitoryRepairAcceptMapper.selectDormitoryRepairAcceptByAcceptRepairId(acceptRepairId);
    }

    /**
     * 查询任务指派列表
     * 
     * @param dormitoryRepairAccept 任务指派
     * @return 任务指派
     */
    @Override
    public List<DormitoryRepairAccept> selectDormitoryRepairAcceptList(DormitoryRepairAccept dormitoryRepairAccept)
    {
        return dormitoryRepairAcceptMapper.selectDormitoryRepairAcceptList(dormitoryRepairAccept);
    }

//    /**
//     * 新增任务指派
//     *
//     * @param dormitoryRepairAccept 任务指派
//     * @return 结果
//     */
//    @Override
//    public int insertDormitoryRepairAccept(DormitoryRepairAccept dormitoryRepairAccept)
//    {
//        return dormitoryRepairAcceptMapper.insertDormitoryRepairAccept(dormitoryRepairAccept);
//    }

    /**
     * 修改任务指派
     * 
     * @param dormitoryRepairAccept 任务指派
     * @return 结果
     */
    @Override
    public int updateDormitoryRepairAccept(DormitoryRepairAccept dormitoryRepairAccept)
    {
        dormitoryRepairforMapper.insertDormitoryRepairfor(dormitoryRepairAccept);
        return dormitoryRepairAcceptMapper.updateDormitoryRepairAccept(dormitoryRepairAccept);
    }

    /**
     * 批量删除任务指派
     * 
     * @param acceptRepairIds 需要删除的任务指派主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryRepairAcceptByAcceptRepairIds(Long[] acceptRepairIds)
    {
        return dormitoryRepairAcceptMapper.deleteDormitoryRepairAcceptByAcceptRepairIds(acceptRepairIds);
    }

    /**
     * 删除任务指派信息
     * 
     * @param acceptRepairId 任务指派主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryRepairAcceptByAcceptRepairId(Long acceptRepairId)
    {
        return dormitoryRepairAcceptMapper.deleteDormitoryRepairAcceptByAcceptRepairId(acceptRepairId);
    }
}
