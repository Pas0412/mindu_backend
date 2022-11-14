package com.example.mindu_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mindu_backend.entity.Mdzy;
import com.example.mindu_backend.mapper.MdzyMapper;
import com.example.mindu_backend.service.MdzyService;
import org.springframework.stereotype.Service;

@Service
public class MdzyServiceImpl extends ServiceImpl<MdzyMapper, Mdzy> implements MdzyService {
}
