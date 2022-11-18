package com.ruoyi.system.service;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.system.domain.DormitoryRoomPoint;

/**
 * 宿舍卫生评分Service接口
 * 
 * @author 朱鸿斌
 * @date 2022-04-28
 */
public interface IDormitoryRoomPointService 
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

    /**
     * 批量删除宿舍卫生评分
     * 
     * @param dormitoryIds 需要删除的宿舍卫生评分主键集合
     * @return 结果
     */
    public int deleteDormitoryRoomPointByDormitoryIds(String[] dormitoryIds);

    /**
     * 删除宿舍卫生评分信息
     * 
     * @param dormitoryId 宿舍卫生评分主键
     * @return 结果
     */
    public int deleteDormitoryRoomPointByDormitoryId(String dormitoryId);

    /**
     * 导入用户数据
     *
     * @param userList 用户数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @param operName 操作用户
     * @return 结果
     */
    public String importUser(List<DormitoryRoomPoint> userList, Boolean isUpdateSupport, String operName);
}
