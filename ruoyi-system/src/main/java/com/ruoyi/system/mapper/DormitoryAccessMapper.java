package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DormitoryAccess;

/**
 * 宿舍门禁管理Mapper接口
 * 
 * @author zhb
 * @date 2022-01-07
 */
public interface DormitoryAccessMapper 
{
    /**
     * 查询宿舍门禁管理
     * 
     * @param accessId 宿舍门禁管理主键
     * @return 宿舍门禁管理
     */
    public DormitoryAccess selectDormitoryAccessByAccessId(Long accessId);

    /**
     * 查询学号是否有效
     * @param stuId
     * @return
     */
    public int selectDormitoryAccessByStuId(Long stuId);

    /**
     * 查询宿舍门禁管理列表
     * 
     * @param dormitoryAccess 宿舍门禁管理
     * @return 宿舍门禁管理集合
     */
    public List<DormitoryAccess> selectDormitoryAccessList(DormitoryAccess dormitoryAccess);

    /**
     * 新增宿舍门禁管理
     * 
     * @param dormitoryAccess 宿舍门禁管理
     * @return 结果
     */
    public int insertDormitoryAccess(DormitoryAccess dormitoryAccess);

    /**
     * 修改宿舍门禁管理
     * 
     * @param dormitoryAccess 宿舍门禁管理
     * @return 结果
     */
    public int updateDormitoryAccess(DormitoryAccess dormitoryAccess);

    /**
     * 删除宿舍门禁管理
     * 
     * @param accessId 宿舍门禁管理主键
     * @return 结果
     */
    public int deleteDormitoryAccessByAccessId(Long accessId);

    /**
     * 批量删除宿舍门禁管理
     * 
     * @param accessIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDormitoryAccessByAccessIds(Long[] accessIds);
}
