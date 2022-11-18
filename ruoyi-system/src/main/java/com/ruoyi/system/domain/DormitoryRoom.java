package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 房间管理对象 dormitory_room
 *
 * @author 朱鸿斌
 * @date 2022-02-28
 */
public class DormitoryRoom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private String dormitoryId;

    /** 楼层 */
    @Excel(name = "楼层")
    private Long dormitoryFloor;

    /** 宿舍楼 */
    @Excel(name = "宿舍楼")
    private String dormitoryBuliding;

    /** 余额 */
    @Excel(name = "余额")
    private Long roomBalance;

    /** 状态 */
    @Excel(name = "状态")
    private String state;

    /** 分数 */
    @Excel(name = "分数")
    private Long point;

    /** 宿舍人数 */
    @Excel(name = "宿舍人数")
    private Long roomCount;

    public void setDormitoryId(String dormitoryId)
    {
        this.dormitoryId = dormitoryId;
    }

    public String getDormitoryId()
    {
        return dormitoryId;
    }
    public void setDormitoryFloor(Long dormitoryFloor)
    {
        this.dormitoryFloor = dormitoryFloor;
    }

    public Long getDormitoryFloor()
    {
        return dormitoryFloor;
    }
    public void setDormitoryBuliding(String dormitoryBuliding)
    {
        this.dormitoryBuliding = dormitoryBuliding;
    }

    public String getDormitoryBuliding()
    {
        return dormitoryBuliding;
    }
    public void setRoomBalance(Long roomBalance)
    {
        this.roomBalance = roomBalance;
    }

    public Long getRoomBalance()
    {
        return roomBalance;
    }
    public void setState(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }
    public void setPoint(Long point)
    {
        this.point = point;
    }

    public Long getPoint()
    {
        return point;
    }
    public void setRoomCount(Long roomCount)
    {
        this.roomCount = roomCount;
    }

    public Long getRoomCount()
    {
        return roomCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("dormitoryId", getDormitoryId())
                .append("dormitoryFloor", getDormitoryFloor())
                .append("dormitoryBuliding", getDormitoryBuliding())
                .append("roomBalance", getRoomBalance())
                .append("state", getState())
                .append("point", getPoint())
                .append("roomCount", getRoomCount())
                .toString();
    }
}
