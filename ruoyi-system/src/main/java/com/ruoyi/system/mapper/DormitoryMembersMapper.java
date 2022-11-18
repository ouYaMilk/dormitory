package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DormitoryMembers;

/**
 * 宿舍成员管理Mapper接口
 * 
 * @author zhb
 * @date 2022-01-10
 */
public interface DormitoryMembersMapper 
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
     * 验证房间号有效
     * @param roomId
     * @return
     */
    public int selectDormitoryMembersByStuId(String roomId);

    /**
     * 新增宿舍成员管理
     * 
     * @param dormitoryMembers 宿舍成员管理
     * @return 结果
     */
    public int insertDormitoryMembers(DormitoryMembers dormitoryMembers);

    /**
     * 修改宿舍成员管理
     * 
     * @param dormitoryMembers 宿舍成员管理
     * @return 结果
     */
    public int updateDormitoryMembers(DormitoryMembers dormitoryMembers);

    /**
     * 删除宿舍成员管理
     * 
     * @param id 宿舍成员管理主键
     * @return 结果
     */
    public int deleteDormitoryMembersById(Long id);

    /**
     * 批量删除宿舍成员管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDormitoryMembersByIds(Long[] ids);
}
