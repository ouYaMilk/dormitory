package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DormitoryRoomMapper;
import com.ruoyi.system.domain.DormitoryRoom;
import com.ruoyi.system.service.IDormitoryRoomService;



/**
 * 宿舍房间管理Service业务层处理
 * 
 * @author zhb
 * @date 2022-01-10
 */
@Service
public class DormitoryRoomServiceImpl implements IDormitoryRoomService 
{
    @Autowired
    private DormitoryRoomMapper dormitoryRoomMapper;

    /**
     * 查询宿舍房间管理
     * 
     * @param dormitoryId 宿舍房间管理主键
     * @return 宿舍房间管理
     */
    @Override
    public DormitoryRoom selectDormitoryRoomByDormitoryId(String dormitoryId)
    {
        return dormitoryRoomMapper.selectDormitoryRoomByDormitoryId(dormitoryId);
    }


    /**
     * 查询宿舍房间管理列表
     * 
     * @param dormitoryRoom 宿舍房间管理
     * @return 宿舍房间管理
     */
    @Override
    public List<DormitoryRoom> selectDormitoryRoomList(DormitoryRoom dormitoryRoom)
    {
        return dormitoryRoomMapper.selectDormitoryRoomList(dormitoryRoom);
    }

    /**
     * 新增宿舍房间管理
     * 
     * @param dormitoryRoom 宿舍房间管理
     * @return 结果
     */
    @Override
    public int insertDormitoryRoom(DormitoryRoom dormitoryRoom)
    {
        return dormitoryRoomMapper.insertDormitoryRoom(dormitoryRoom);
    }

    /**
     * 修改宿舍房间管理
     * 
     * @param dormitoryRoom 宿舍房间管理
     * @return 结果
     */
    @Override
    public int updateDormitoryRoom(DormitoryRoom dormitoryRoom)
    {
        return dormitoryRoomMapper.updateDormitoryRoom(dormitoryRoom);
    }

    /**
     * 批量删除宿舍房间管理
     * 
     * @param dormitoryIds 需要删除的宿舍房间管理主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryRoomByDormitoryIds(String[] dormitoryIds)
    {
        return dormitoryRoomMapper.deleteDormitoryRoomByDormitoryIds(dormitoryIds);
    }

    /**
     * 删除宿舍房间管理信息
     * 
     * @param dormitoryId 宿舍房间管理主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryRoomByDormitoryId(String dormitoryId)
    {
        return dormitoryRoomMapper.deleteDormitoryRoomByDormitoryId(dormitoryId);
    }


    /**
     * 修改用户状态
     *
     * @param user 用户信息
     * @return 结果
     */
    @Override
    public int updateUserState(DormitoryRoom user)
    {
        return dormitoryRoomMapper.updateDormitoryRoom(user);
    }

}
