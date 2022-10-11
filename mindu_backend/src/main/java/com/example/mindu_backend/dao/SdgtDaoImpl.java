package com.example.mindu_backend.dao;

import com.example.mindu_backend.entity.Sdgt;

import java.util.List;

public class SdgtDaoImpl implements ISdgtDao{

    @Override
    public List<Sdgt> queryForm(String lessee) {
        String sql = "select * from 水调歌头房产租赁明细表 where 承租方=?";
//        List<Sdgt> list = jdbcTemplate.query;
        return null;
    }

    @Override
    public List<Sdgt> queryForm(Float propertyArea) {
        return null;
    }
}
