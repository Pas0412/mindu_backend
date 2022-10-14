package com.example.mindu_backend.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "分楼盘租赁汇总表")
public class Conclusion implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableField(value = "id")
    private int id;

    @TableField(value = "产权人")
    private String owner;

    @TableField(value = "楼盘名称")
    private String flatsName;

    @TableField(value = "出租率")
    private float rentRate;

    @TableField(value = "产权面积")
    private float ownSurface;

    @TableField(value = "自用面积")
    private float selfSurface;

    @TableField(value = "空置面积")
    private float videSurface;

    @TableField(value = "租赁面积")
    private float rentSurface;
}
