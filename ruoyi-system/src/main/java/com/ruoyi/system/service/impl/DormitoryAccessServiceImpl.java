package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DormitoryAccessMapper;
import com.ruoyi.system.domain.DormitoryAccess;
import com.ruoyi.system.service.IDormitoryAccessService;

/**
 * 宿舍门禁管理Service业务层处理
 *
 * @author zhb
 * @date 2022-01-07
 */
@Service
public class DormitoryAccessServiceImpl implements IDormitoryAccessService {
    @Autowired
    private DormitoryAccessMapper dormitoryAccessMapper;

    /**
     * 查询宿舍门禁管理
     *
     * @param accessId 宿舍门禁管理主键
     * @return 宿舍门禁管理
     */
    @Override
    public DormitoryAccess selectDormitoryAccessByAccessId(Long accessId) {
        return dormitoryAccessMapper.selectDormitoryAccessByAccessId(accessId);
    }

    /**
     * 查询宿舍门禁管理列表
     *
     * @param dormitoryAccess 宿舍门禁管理
     * @return 宿舍门禁管理
     */
    @Override
    public List<DormitoryAccess> selectDormitoryAccessList(DormitoryAccess dormitoryAccess) {
        return dormitoryAccessMapper.selectDormitoryAccessList(dormitoryAccess);
    }

    /**
     * 新增宿舍门禁管理
     *
     * @param dormitoryAccess 宿舍门禁管理
     * @return 结果
     */
    @Override
    public AjaxResult insertDormitoryAccess(DormitoryAccess dormitoryAccess) {
        long stuId = dormitoryAccess.getStuId();
        int i = dormitoryAccessMapper.selectDormitoryAccessByStuId(stuId);
        if (i == 0) {
            return AjaxResult.error("此为无效学号");
        }
        return AjaxResult.success( dormitoryAccessMapper.insertDormitoryAccess(dormitoryAccess)) ;
    }

    /**
     * 修改宿舍门禁管理
     *
     * @param dormitoryAccess 宿舍门禁管理
     * @return 结果
     */
    @Override
    public int updateDormitoryAccess(DormitoryAccess dormitoryAccess) {
        return dormitoryAccessMapper.updateDormitoryAccess(dormitoryAccess);
    }

    /**
     * 批量删除宿舍门禁管理
     *
     * @param accessIds 需要删除的宿舍门禁管理主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryAccessByAccessIds(Long[] accessIds) {
        return dormitoryAccessMapper.deleteDormitoryAccessByAccessIds(accessIds);
    }

    /**
     * 删除宿舍门禁管理信息
     *
     * @param accessId 宿舍门禁管理主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryAccessByAccessId(Long accessId) {
        return dormitoryAccessMapper.deleteDormitoryAccessByAccessId(accessId);
    }
}
