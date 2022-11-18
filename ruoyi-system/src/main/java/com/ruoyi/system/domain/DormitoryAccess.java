package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 宿舍门禁管理对象 dormitory_access
 * 
 * @author zhb
 * @date 2022-01-07
 */
public class DormitoryAccess extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long accessId;

    /** 宿舍楼 */
    @Excel(name = "宿舍楼")
    private String dormitoryBuliding;

    /** 学号 */
    @Excel(name = "学号")
    private Long stuId;

    /** 离开时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "离开时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date outtime;

    /** 返回时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "返回时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date intime;

    /**
     * 请假单
     */
    @Excel(name = "请假单")
    private String accessPicture;

    public String getAccessPicture() {
        return accessPicture;
    }

    public void setAccessPicture(String accessPicture) {
        this.accessPicture = accessPicture;
    }

    public void setAccessId(Long accessId)
    {
        this.accessId = accessId;
    }

    public Long getAccessId() 
    {
        return accessId;
    }
    public void setDormitoryBuliding(String dormitoryBuliding) 
    {
        this.dormitoryBuliding = dormitoryBuliding;
    }

    public String getDormitoryBuliding() 
    {
        return dormitoryBuliding;
    }
    public void setStuId(Long stuId) 
    {
        this.stuId = stuId;
    }

    public Long getStuId() 
    {
        return stuId;
    }
    public void setOuttime(Date outtime) 
    {
        this.outtime = outtime;
    }

    public Date getOuttime() 
    {
        return outtime;
    }
    public void setIntime(Date intime) 
    {
        this.intime = intime;
    }

    public Date getIntime() 
    {
        return intime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("accessId", getAccessId())
            .append("dormitoryBuliding", getDormitoryBuliding())
            .append("stuId", getStuId())
            .append("outtime", getOuttime())
            .append("intime", getIntime())
            .toString();
    }
}
