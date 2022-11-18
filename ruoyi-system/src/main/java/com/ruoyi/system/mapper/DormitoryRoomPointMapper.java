package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DormitoryRoomPoint;

/**
 * 宿舍卫生评分Mapper接口
 * 
 * @author 朱鸿斌
 * @date 2022-04-28
 */
public interface DormitoryRoomPointMapper 
{
    /**
     * 查询宿舍卫生评分
     * 
     * @param dormitoryId 宿舍卫生评分主键
     * @return 宿舍卫生评分
     */
    public DormitoryRoomPoint selectDormitoryRoomPointByDormitoryId(String dormitoryId);

    /**
     * 查询宿舍卫生评分列表
     * 
     * @param dormitoryRoomPoint 宿舍卫生评分
     * @return 宿舍卫生评分集合
     */
    public List<DormitoryRoomPoint> selectDormitoryRoomPointList(DormitoryRoomPoint dormitoryRoomPoint);

    /**
     * 查询数据是否存在
     *
     * @param dormitoryRoomPoint 宿舍卫生评分
     * @return 宿舍卫生评分集合
     */
    public int selectDormitoryRoomPointById(DormitoryRoomPoint dormitoryRoomPoint);

    /**
     * 新增宿舍卫生评分
     * 
     * @param dormitoryRoomPoint 宿舍卫生评分
     * @return 结果
     */
    public int insertDormitoryRoomPoint(DormitoryRoomPoint dormitoryRoomPoint);

    /**
     * 修改宿舍卫生评分
     * 
     * @param dormitoryRoomPoint 宿舍卫生评分
     * @return 结果
     */
    public int updateDormitoryRoomPoint(DormitoryRoomPoint dormitoryRoomPoint);

    public int updateDormitoryRoomPointAvgPoint(int a);

    public int updateDormitoryRoomPointById(DormitoryRoomPoint dormitoryRoomPoint);

    /**
     * 删除宿舍卫生评分
     * 
     * @param dormitoryId 宿舍卫生评分主键
     * @return 结果
     */
    public int deleteDormitoryRoomPointByDormitoryId(String dormitoryId);

    /**
     * 批量删除宿舍卫生评分
     * 
     * @param dormitoryIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDormitoryRoomPointByDormitoryIds(String[] dormitoryIds);

    /**
     * count
     * @return 个数
     */
    public int selectDormitoryRoomPointCount();

    /**
     * sum
     * @return 总数
     */
    public int selectDormitoryRoomPointSum();
}
