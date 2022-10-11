package com.example.mindu_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mindu_backend.entity.Sdgt;
import com.example.mindu_backend.mapper.SdgtMapper;
import com.example.mindu_backend.service.SdgtService;
import org.springframework.stereotype.Service;

@Service
public class SdgtServiceImpl extends ServiceImpl<SdgtMapper, Sdgt> implements SdgtService {
}
