package com.example.mindu_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mindu_backend.entity.User;
import com.example.mindu_backend.mapper.UserMapper;
import com.example.mindu_backend.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
