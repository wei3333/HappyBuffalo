package com.example.happybuffalo.controller;


import com.example.happybuffalo.common.ResponseInfo;
import com.example.happybuffalo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author HB
 * @since 2024-03-06
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService postService;

    @GetMapping("/list")
    public ResponseInfo<Integer> list(Integer id) {
        // 模拟异常业务代码
        int num = 5 / id;
        log.info("计算结果num={}", num);
        return ResponseInfo.success(num);
    }
}
