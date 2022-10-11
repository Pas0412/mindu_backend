package com.example.mindu_backend.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.math.BigInteger;

@Data
@TableName(value="水调歌头房产租赁明细表")
public class Sdgt implements Serializable {
    private static final long serialVersionUID = 1L;

//    private int id;

    @TableField(value = "id")
    private int id;

    @TableField(value = "产权人")
    private String owner;

    @TableField(value = "产权地址")
    private String ownerAddress;

    @TableField(value = "性质")
    private String properties;

    @TableField(value = "用途")
    private String purpose;

    @TableField(value = "承租方")
    private String lessee;

    @TableField(value = "产权面积")
    private float ownSurface;

    @TableField(value = "自用面积")
    private float selfSurface;

    @TableField(value = "空置面积")
    private float videSurface;

    @TableField(value = "租赁面积")
    private int rentRate;

    @TableField(value = "租赁价格")
    private float rentPrice;

    @TableField(value = "月租金")
    private float monthlyRent;

    @TableField(value = "递增率")
    private int incrementalRate;

    @TableField(value = "递增时间")
    private String incrementalTime;

    @TableField(value = "合同起始")
    private String contractStart;

    @TableField(value = "合同到期")
    private String contractClose;

    @TableField(value = "租赁年限")
    private int leaseTerm;

    @TableField(value = "合同总价")
    private BigInteger totalPrice;

    @TableField(value = "交付日期")
    private String deliveryDate;

}
