package com.example.mindu_backend.dao;

import com.example.mindu_backend.entity.Sdgt;

import java.util.List;

public interface ISdgtDao {
    List<Sdgt> queryForm(String lessee);

    List<Sdgt> queryForm(Float propertyArea);
}
