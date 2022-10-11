package com.example.mindu_backend.entity;

import lombok.Data;

import java.io.Serializable;

/*
* 登录用户类（员工）
* */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String password;

    private Integer isadmin;
}
