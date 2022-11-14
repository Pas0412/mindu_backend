package com.example.mindu_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mindu_backend.entity.GroupAuth;
import com.example.mindu_backend.mapper.GroupAuthMapper;
import com.example.mindu_backend.service.GroupAuthService;
import org.springframework.stereotype.Service;

@Service
public class GroupAuthServiceImpl extends ServiceImpl<GroupAuthMapper, GroupAuth> implements GroupAuthService {
}
