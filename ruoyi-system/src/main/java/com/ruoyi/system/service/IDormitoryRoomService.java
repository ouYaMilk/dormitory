package com.ruoyi.system.service;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.system.domain.DormitoryRoom;

/**
 * 宿舍房间管理Service接口
 * 
 * @author zhb
 * @date 2022-01-10
 */
public interface IDormitoryRoomService {
    /**
     * 查询宿舍房间管理
     *
     * @param dormitoryId 宿舍房间管理主键
     * @return 宿舍房间管理
     */
    public DormitoryRoom selectDormitoryRoomByDormitoryId(String dormitoryId);




    /**
     * 查询宿舍房间管理列表
     *
     * @param dormitoryRoom 宿舍房间管理
     * @return 宿舍房间管理集合
     */
    public List<DormitoryRoom> selectDormitoryRoomList(DormitoryRoom dormitoryRoom);

    /**
     * 新增宿舍房间管理
     *
     * @param dormitoryRoom 宿舍房间管理
     * @return 结果
     */
    public int insertDormitoryRoom(DormitoryRoom dormitoryRoom);

    /**
     * 修改宿舍房间管理
     *
     * @param dormitoryRoom 宿舍房间管理
     * @return 结果
     */
    public int updateDormitoryRoom(DormitoryRoom dormitoryRoom);

    /**
     * 批量删除宿舍房间管理
     *
     * @param dormitoryIds 需要删除的宿舍房间管理主键集合
     * @return 结果
     */
    public int deleteDormitoryRoomByDormitoryIds(String[] dormitoryIds);

    /**
     * 修改用户状态
     *
     * @param user 用户信息
     * @return 结果
     */
    public int updateUserState(DormitoryRoom user);

    /**
     * 删除宿舍房间管理信息
     *
     * @param dormitoryId 宿舍房间管理主键
     * @return 结果
     */
    public int deleteDormitoryRoomByDormitoryId(String dormitoryId);
}

