package com.ruoyi.system.mapper;

import java.util.List;

import com.ruoyi.system.domain.DormitoryMembers;
import com.ruoyi.system.domain.DormitoryRoom;

/**
 * 宿舍房间管理Mapper接口
 * 
 * @author zhb
 * @date 2022-01-10
 */
public interface DormitoryRoomMapper 
{
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
     * 查询宿舍人数
     * @param dormitoryMembers
     * @return
     */
    public int selectDormitoryRoomNum(DormitoryMembers dormitoryMembers);

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
     * 删除宿舍房间管理
     * 
     * @param dormitoryId 宿舍房间管理主键
     * @return 结果
     */
    public int deleteDormitoryRoomByDormitoryId(String dormitoryId);

    /**
     * 批量删除宿舍房间管理
     * 
     * @param dormitoryIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDormitoryRoomByDormitoryIds(String[] dormitoryIds);
}
