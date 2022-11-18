package com.ruoyi.system.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 任务指派对象 dormitory_repair_accept
 *
 * @author 朱鸿斌
 * @date 2022-04-27
 */

public class DormitoryRepairAccept extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 维修编号
     */
    private Long repairFid;
    /**
     * 主键
     */
    private Long acceptRepairId;

    /**
     * 报修单号
     */
    private Long repairId;

    /**
     * 宿舍楼
     */
    private String dormitoryBuliding;

    /**
     * 维修员姓名
     */
    private String repairerName;

    /**
     * 房间号
     */
    private String dormitoryId;

    /**
     * 学生姓名
     */
    private String stuName;

    /**
     * 报修时间
     */
    private Date repairStartTime;

    /**
     * 维修内容
     */
    private String repairContent;

    /**
     * 报修照片
     */
    private String repairPicture;

    /**
     * 指派时间
     */
    private Date acceptTime;

    /**
     * 维修结果图片
     */
    private String finishPicture;

    /**
     * 维修费用
     */
    @Excel(name = "维修费用")
    private Long repairCost;


    public Long getRepairFid() {
        return repairFid;
    }

    public void setRepairFid(Long repairFid) {
        this.repairFid = repairFid;
    }

    public Long getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(Long repairCost) {
        this.repairCost = repairCost;
    }

    public void setRepairId(Long repairId) {
        this.repairId = repairId;
    }

    public Long getRepairId() {
        return repairId;
    }

    public void setDormitoryBuliding(String dormitoryBuliding) {
        this.dormitoryBuliding = dormitoryBuliding;
    }

    public String getDormitoryBuliding() {
        return dormitoryBuliding;
    }

    public void setRepairerName(String repairerName) {
        this.repairerName = repairerName;
    }

    public String getRepairerName() {
        return repairerName;
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

    public void setRepairStartTime(Date repairStartTime) {
        this.repairStartTime = repairStartTime;
    }

    public Date getRepairStartTime() {
        return repairStartTime;
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

    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    public Date getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptRepairId(Long acceptRepairId) {
        this.acceptRepairId = acceptRepairId;
    }

    public Long getAcceptRepairId() {
        return acceptRepairId;
    }

    public String getFinishPicture() {
        return finishPicture;
    }

    public void setFinishPicture(String finishPicture) {
        this.finishPicture = finishPicture;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("repairId", getRepairId())
                .append("dormitoryBuliding", getDormitoryBuliding())
                .append("repairerName", getRepairerName())
                .append("dormitoryId", getDormitoryId())
                .append("stuName", getStuName())
                .append("repairStartTime", getRepairStartTime())
                .append("repairContent", getRepairContent())
                .append("repairPicture", getRepairPicture())
                .append("acceptTime", getAcceptTime())
                .append("acceptRepairId", getAcceptRepairId())
                .append("finishPicture", getFinishPicture())
                .toString();
    }
}
