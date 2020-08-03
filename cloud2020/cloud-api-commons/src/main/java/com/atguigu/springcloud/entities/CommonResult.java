package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author haishao
 * @create 2020-08-03-22:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //404 not_found
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
