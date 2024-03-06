package com.example.happybuffalo.service.impl;

import com.example.happybuffalo.entity.User;
import com.example.happybuffalo.mapper.UserMapper;
import com.example.happybuffalo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HB
 * @since 2024-03-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
