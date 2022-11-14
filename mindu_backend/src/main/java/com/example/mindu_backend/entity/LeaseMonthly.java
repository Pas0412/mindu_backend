package com.example.mindu_backend.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

//租赁房产月度汇总表
@Data
@TableName(value = "租赁房产月度汇总表")
public class LeaseMonthly implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableField(value = "id")
    private int id;

    @TableField(value = "产权人")
    private String lessee;

    @TableField(value = "年预算收入")
    private float annualIncome;

    @TableField(value = "本月收入")
    private float income;

    @TableField(value = "1_7月累计收入")
    private float income1_7;

    @TableField(value = "完成率")
    private float completionRate;
}
