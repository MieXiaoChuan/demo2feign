package com.example.demo2feign.controller.service;

import com.example.demo2feign.dto.Result;
import lombok.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 版权信息: © 聚均科技
 *
 * @author liuyang
 * @description
 * @since 2022/6/23 15:08
 */
@Service
@FeignClient(name = "feignValueService", url = "${ty.bank.url}")
public interface IFeignValueService {

    @RequestMapping(value = "/f-agent/api/industry/risk", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Result industryRisk(@RequestParam Map<String, String> param, @RequestBody String body, @RequestHeader("Authorization") String authorization);

}
