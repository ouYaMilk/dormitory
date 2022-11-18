package com.ruoyi.system.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 宿舍维修管理对象 dormitory_repairfor
 *
 * @author 朱鸿斌
 * @date 2022-02-15
 */
public class DormitoryRepairfor extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 维修编号
     */
    private Long repairFid;

    /**
     * 报修编号
     */
    @Excel(name = "报修编号")
    private Long repairId;

    /**
     * 宿舍楼
     */
    @Excel(name = "宿舍楼")
    private String dormitoryBuilding;


    /**
     * 宿舍号
     */
    @Excel(name = "宿舍号")
    private String dormitoryId;

    /**
     * 学生姓名
     */
    @Excel(name = "学生姓名")
    private String stuName;

    /**
     * 维修人员姓名
     */
    @Excel(name = "维修人员姓名")
    private String repairerName;

    /**
     * 报修时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "报修时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date repairStartTime;

    /**
     * 维修完成时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "维修完成时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date repairFinishTime;

    /**
     * 报修内容
     */
    @Excel(name = "报修内容")
    private String repairContent;

    /**
     * 维修图片
     */
    @Excel(name = "维修图片")
    private String repairPicture;

    /**
     * 维修费用
     */
    @Excel(name = "维修费用")
    private String repairCost;

    /**
     * 指派时间
     */
    private Date acceptTime;

    /**
     * 维修结果图片
     */
    private String finishPicture;

    public String getFinishPicture() {
        return finishPicture;
    }

    public void setFinishPicture(String finishPicture) {
        this.finishPicture = finishPicture;
    }

    public Date getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    public void setRepairFid(Long repairFid) {
        this.repairFid = repairFid;
    }

    public Long getRepairFid() {
        return repairFid;
    }

    public void setRepairId(Long repairId) {
        this.repairId = repairId;
    }

    public Long getRepairId() {
        return repairId;
    }

    public void setDormitoryBuilding(String dormitoryBuilding) {
        this.dormitoryBuilding = dormitoryBuilding;
    }

    public String getDormitoryBuilding() {
        return dormitoryBuilding;
    }


    public void setDormitoryId(String dormitoryId) {
        this.dormitoryId = dormitoryId;
    }

    public String getDormitoryId() {
        return dormitoryId;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuName() {
        return stuName;
    }

    public void setRepairerName(String repairerName) {
        this.repairerName = repairerName;
    }

    public String getRepairerName() {
        return repairerName;
    }

    public void setRepairStartTime(Date repairStartTime) {
        this.repairStartTime = repairStartTime;
    }

    public Date getRepairStartTime() {
        return repairStartTime;
    }

    public void setRepairFinishTime(Date repairFinishTime) {
        this.repairFinishTime = repairFinishTime;
    }

    public Date getRepairFinishTime() {
        return repairFinishTime;
    }

    public void setRepairContent(String repairContent) {
        this.repairContent = repairContent;
    }

    public String getRepairContent() {
        return repairContent;
    }

    public void setRepairPicture(String repairPicture) {
        this.repairPicture = repairPicture;
    }

    public String getRepairPicture() {
        return repairPicture;
    }

    public void setRepairCost(String repairCost) {
        this.repairCost = repairCost;
    }

    public String getRepairCost() {
        return repairCost;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("repairFid", getRepairFid())
                .append("repairId", getRepairId())
                .append("dormitoryBuilding", getDormitoryBuilding())
                .append("dormitoryId", getDormitoryId())
                .append("stuName", getStuName())
                .append("repairerName", getRepairerName())
                .append("repairStartTime", getRepairStartTime())
                .append("repairFinishTime", getRepairFinishTime())
                .append("repairContent", getRepairContent())
                .append("repairPicture", getRepairPicture())
                .append("repairCost", getRepairCost())
                .toString();
    }
}
