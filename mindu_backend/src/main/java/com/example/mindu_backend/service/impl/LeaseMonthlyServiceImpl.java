package com.example.mindu_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mindu_backend.entity.LeaseMonthly;
import com.example.mindu_backend.mapper.LeaseMonthlyMapper;
import com.example.mindu_backend.service.LeaseMonthlyService;
import org.springframework.stereotype.Service;

@Service
public class LeaseMonthlyServiceImpl extends ServiceImpl<LeaseMonthlyMapper, LeaseMonthly> implements LeaseMonthlyService {
}
