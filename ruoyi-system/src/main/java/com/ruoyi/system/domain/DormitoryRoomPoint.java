package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 宿舍卫生评分对象 dormitory_room_point
 * 
 * @author 朱鸿斌
 * @date 2022-04-28
 */
public class DormitoryRoomPoint extends BaseEntity
{
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private long pointKey;

    /** 房间号 */
    @Excel(name = "房间号")
    private String dormitoryId;

    /** 房间楼层 */
    private Long dormitoryFloor;

    /** 宿舍楼 */
    @Excel(name = "宿舍楼")
    private String dormitoryBuliding;

    /** 评分 */
    @Excel(name = "评分")
    private Long point;

    /** 评分日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date pointDate;

    /** 扣分明细 */
    @Excel(name = "扣分明细")
    private String detail;

    /** 平均分 */
    private int avgPoint;

    /** 照片 */
    private String pointPicture;

    public long getPointKey() {
        return pointKey;
    }

    public void setPointKey(long pointKey) {
        this.pointKey = pointKey;
    }

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
    public void setPoint(Long point) 
    {
        this.point = point;
    }

    public Long getPoint() 
    {
        return point;
    }
    public void setPointDate(Date pointDate) 
    {
        this.pointDate = pointDate;
    }

    public Date getPointDate() {
        return pointDate;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setAvgPoint(int avgPoint) {
        this.avgPoint = avgPoint;
    }

    public int getAvgPoint()
    {
        return avgPoint;
    }
    public void setPointPicture(String pointPicture) 
    {
        this.pointPicture = pointPicture;
    }

    public String getPointPicture() 
    {
        return pointPicture;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dormitoryId", getDormitoryId())
            .append("dormitoryFloor", getDormitoryFloor())
            .append("dormitoryBuliding", getDormitoryBuliding())
            .append("point", getPoint())
            .append("pointDate", getPointDate())
            .append("detail", getDetail())
            .append("avgPoint", getAvgPoint())
            .append("pointPicture", getPointPicture())
            .toString();
    }
}
