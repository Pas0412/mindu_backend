package com.example.mindu_backend.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "华兴创投公司房产租赁明细表")
public class Hxct implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableField(value = "id")
    private int id;

    @TableField(value = "产权人")
    private String owner;

    @TableField(value = "产权地址")
    private String ownerAddress;

    @TableField(value = "楼盘名称")
    private String flatsName;

    @TableField(value = "性质")
    private String properties;

    @TableField(value = "用途")
    private String purpose;

    @TableField(value = "承租方")
    private String lessee;

    @TableField(value = "产权面积")
    private float ownSurface;

    @TableField(value = "车位数")
    private int parkingNum;

    @TableField(value = "自用面积")
    private float selfSurface;

    @TableField(value = "空置面积")
    private float videSurface;

    @TableField(value = "租赁面积")
    private float rentSurface;

    @TableField(value = "出租率")
    private int rentRate;

    @TableField(value = "租赁价格")
    private float rentPrice;

    @TableField(value = "月租金")
    private float monthlyRent;

    @TableField(value = "年递增时间")
    private String incrementalTime;

    @TableField(value = "递增后月租金")
    private float afterMonthlyRent;

    @TableField(value = "年递增时间2")
    private String incrementalTime2;

    @TableField(value = "递增率")
    private int incrementalRate;

    @TableField(value = "合同起始")
    private String contractStart;

    @TableField(value = "合同到期")
    private String contractClose;

    @TableField(value = "租赁年限")
    private int leaseTerm;

    @TableField(value = "付款方式")
    private int payment;

    @TableField(value = "收款人")
    private String payee;

    @TableField(value = "收租情况")
    private String situationCollection;

    @TableField(value = "联系人")
    private String contact;

    @TableField(value = "联系电话")
    private String telephone;

    @TableField(value = "备注")
    private String note;
}
