package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 宿舍成员管理对象 dormitory_members
 * 
 * @author zhb
 * @date 2022-01-10
 */
public class DormitoryMembers extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 学号 */
    @Excel(name = "学号")
    private Long stuId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String stuName;

    /** 专业 */
    @Excel(name = "专业")
    private String stuMajor;

    /** 宿舍楼层 */
    @Excel(name = "宿舍楼层")
    private Long dormitoryFloor;

    /** 宿舍房间号 */
    @Excel(name = "宿舍房间号")
    private String dormitoryId;

    /** 宿舍楼名称 */
    @Excel(name = "宿舍楼名称")
    private String dormitoryBuliding;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setStuId(Long stuId) 
    {
        this.stuId = stuId;
    }

    public Long getStuId() 
    {
        return stuId;
    }
    public void setStuName(String stuName) 
    {
        this.stuName = stuName;
    }

    public String getStuName() 
    {
        return stuName;
    }
    public void setStuMajor(String stuMajor) 
    {
        this.stuMajor = stuMajor;
    }

    public String getStuMajor() 
    {
        return stuMajor;
    }
    public void setDormitoryFloor(Long dormitoryFloor) 
    {
        this.dormitoryFloor = dormitoryFloor;
    }

    public Long getDormitoryFloor() 
    {
        return dormitoryFloor;
    }
    public void setDormitoryId(String dormitoryId) 
    {
        this.dormitoryId = dormitoryId;
    }

    public String getDormitoryId() 
    {
        return dormitoryId;
    }
    public void setDormitoryBuliding(String dormitoryBuliding) 
    {
        this.dormitoryBuliding = dormitoryBuliding;
    }

    public String getDormitoryBuliding() 
    {
        return dormitoryBuliding;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuId", getStuId())
            .append("stuName", getStuName())
            .append("stuMajor", getStuMajor())
            .append("dormitoryFloor", getDormitoryFloor())
            .append("dormitoryId", getDormitoryId())
            .append("dormitoryBuliding", getDormitoryBuliding())
            .toString();
    }
}
