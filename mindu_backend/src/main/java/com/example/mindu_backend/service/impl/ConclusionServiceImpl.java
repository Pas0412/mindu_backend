package com.example.mindu_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mindu_backend.entity.Conclusion;
import com.example.mindu_backend.mapper.ConclusionMapper;
import com.example.mindu_backend.service.ConclusionService;
import org.springframework.stereotype.Service;

@Service
public class ConclusionServiceImpl extends ServiceImpl<ConclusionMapper, Conclusion> implements ConclusionService {
}
