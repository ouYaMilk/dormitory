package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 宿舍充值管理对象 dormitory_recharge
 * 
 * @author 朱鴻斌
 * @date 2022-01-07
 */
public class DormitoryRecharge extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 充值编号 */
    private Long rechargeId;

    /** 宿舍号 */
    @Excel(name = "宿舍号")
    private String dormitoryId;

    /** 学号 */
    @Excel(name = "学号")
    private Long stuId;

    /** 充值金额 */
    @Excel(name = "充值金额")
    private Long rechargeMoney;

    /** 充值时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "充值时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date rechargeTime;

    public void setRechargeId(Long rechargeId)
    {
        this.rechargeId = rechargeId;
    }

    public Long getRechargeId() 
    {
        return rechargeId;
    }

    public void setDormitoryId(String dormitoryId)
    {
        this.dormitoryId = dormitoryId;
    }

    public String getDormitoryId()
    {
        return dormitoryId;
    }

    public void setStuId(Long stuId) 
    {
        this.stuId = stuId;
    }

    public Long getStuId() 
    {
        return stuId;
    }

    public void setRechargeMoney(long rechargeMoney)
    {
        this.rechargeMoney = rechargeMoney;
    }

    public Long getRechargeMoney()
    {
        return rechargeMoney;
    }

    public void setRechargeTime(Date rechargeTime) 
    {
        this.rechargeTime = rechargeTime;
    }

    public Date getRechargeTime() 
    {
        return rechargeTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rechargeId", getRechargeId())
            .append("dormitoryId", getDormitoryId())
            .append("stuId", getStuId())
            .append("rechargeMoney", getRechargeMoney())
            .append("rechargeTime", getRechargeTime())
            .toString();
    }
}
