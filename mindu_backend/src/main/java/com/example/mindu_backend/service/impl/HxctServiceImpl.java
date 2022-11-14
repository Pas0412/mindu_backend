package com.example.mindu_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mindu_backend.entity.Hxct;
import com.example.mindu_backend.mapper.HxctMapper;
import com.example.mindu_backend.service.HxctService;
import org.springframework.stereotype.Service;

@Service
public class HxctServiceImpl extends ServiceImpl<HxctMapper, Hxct> implements HxctService{
}
