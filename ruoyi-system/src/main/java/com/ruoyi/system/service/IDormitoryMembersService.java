package com.ruoyi.system.service;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.DormitoryMembers;

/**
 * 宿舍成员管理Service接口
 * 
 * @author zhb
 * @date 2022-01-10
 */
public interface IDormitoryMembersService 
{
    /**
     * 查询宿舍成员管理
     * 
     * @param id 宿舍成员管理主键
     * @return 宿舍成员管理
     */
    public DormitoryMembers selectDormitoryMembersById(Long id);

    /**
     * 查询宿舍成员管理列表
     * 
     * @param dormitoryMembers 宿舍成员管理
     * @return 宿舍成员管理集合
     */
    public List<DormitoryMembers> selectDormitoryMembersList(DormitoryMembers dormitoryMembers);

    /**
     * 新增宿舍成员管理
     * 
     * @param dormitoryMembers 宿舍成员管理
     * @return 结果
     */
    public AjaxResult insertDormitoryMembers(DormitoryMembers dormitoryMembers);

    /**
     * 修改宿舍成员管理
     * 
     * @param dormitoryMembers 宿舍成员管理
     * @return 结果
     */
    public AjaxResult updateDormitoryMembers(DormitoryMembers dormitoryMembers);

    /**
     * 批量删除宿舍成员管理
     * 
     * @param ids 需要删除的宿舍成员管理主键集合
     * @return 结果
     */
    public int deleteDormitoryMembersByIds(Long[] ids);

    /**
     * 删除宿舍成员管理信息
     * 
     * @param id 宿舍成员管理主键
     * @return 结果
     */
    public int deleteDormitoryMembersById(Long id);
}
