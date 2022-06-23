package com.example.demo2feign.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * 版权信息: © 聚均科技
 *
 * @author liuyang
 * @description
 * @since 2022/6/23 15:52
 */
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean success = true;
    private String message;
    private String code;
    private T result;
    @JsonIgnore
    private long timestamp = System.currentTimeMillis();

}
