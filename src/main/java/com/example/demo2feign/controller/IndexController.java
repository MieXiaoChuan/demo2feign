package com.example.demo2feign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 版权信息: © 聚均科技
 *
 * @author liuyang
 * @description
 * @since 2022/6/23 14:59
 */
@RestController()
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/hi")
    String hi() {
        return "hi!";
    }
}
