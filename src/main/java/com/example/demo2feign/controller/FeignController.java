package com.example.demo2feign.controller;

import com.example.demo2feign.service.IFeignService;
import com.example.demo2feign.dto.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 版权信息: © 聚均科技
 *
 * @author liuyang
 * @description
 * @since 2022/6/23 15:08
 */
@RestController()
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    IFeignService feignService;

    @GetMapping("/industry/risk")
    Result industryRisk () throws IOException {
        Map<String,String> param = new HashMap<>();
        param.put("name","liuyang");
        String body = "{\n" +
                "    \"body\":{\n" +
                "        \"industry\":\"I_SP\",\n" +
                "        \"level\":\"green\",\n" +
                "        \"name\":\"钢铁\",\n" +
                "        \"pageNo\":1,\n" +
                "        \"pageSize\":10\n" +
                "    },\n" +
                "    \"head\":{\n" +
                "        \"appId\":\"1\",\n" +
                "        \"dataType\":\"IGNORE\",\n" +
                "        \"serialNo\":\"SerialNo\",\n" +
                "        \"sign\":\"Sign\",\n" +
                "        \"timestamp\":1655775300564\n" +
                "    }\n" +
                "}";
        String authorization = "123";
        Result result = feignService.industryRisk(param, body, authorization);
        return result;
    }
}
