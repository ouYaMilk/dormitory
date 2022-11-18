package com.ruoyi.system.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;


/**
 * 宿舍维修管理对象 dormitory_repair
 *
 * @author zhb
 * @date 2022-01-07
 */

public class DormitoryRepair extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 任务指派主键 */
    private Long acceptRepairId;

    /**
     * 维修编号
     */
    private Long repairId;

    /**
     * 宿舍楼
     */
    @Excel(name = "宿舍楼")
    private String dormitoryBuliding;

    /**
     * 维修人
     */
    @Excel(name = "维修人")
    private String repairerName;

    /**
     * 房间号
     */
    @Excel(name = "房间号")
    private String dormitoryId;

    /**
     * 学生姓名
     */
    @Excel(name = "学生姓名")
    private String stuName;


    /**
     * 维修申报时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "维修申报时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date repairStartTime;



    /**
     * 维修申报内容
     */
    @Excel(name = "维修申报内容")
    private String repairContent;

    /**
     *  维修图片
     */
    @Excel(name="维修图片")
    private String repairPicture;

    /**
     * 指派时间
     */
    private Date acceptTime;


    public Long getRepairId() {
        return repairId;
    }

    public void setRepairId(Long repairId) {
        this.repairId = repairId;
    }

    public String getDormitoryBuliding() {
        return dormitoryBuliding;
    }

    public void setDormitoryBuliding(String dormitoryBuliding) {
        this.dormitoryBuliding = dormitoryBuliding;
    }

    public String getRepairerName() {
        return repairerName;
    }

    public void setRepairerName(String repairerName) {
        this.repairerName = repairerName;
    }

    public String getDormitoryId() {
        return dormitoryId;
    }

    public void setDormitoryId(String dormitoryId) {
        this.dormitoryId = dormitoryId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Date getRepairStartTime() {
        return repairStartTime;
    }

    public void setRepairStartTime(Date repairStartTime) {
        this.repairStartTime = repairStartTime;
    }

    public String getRepairContent() {
        return repairContent;
    }

    public void setRepairContent(String repairContent) {
        this.repairContent = repairContent;
    }

    public String getRepairPicture() {
        return repairPicture;
    }

    public void setRepairPicture(String repairPicture) {
        this.repairPicture = repairPicture;
    }

    public Date getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }
}
