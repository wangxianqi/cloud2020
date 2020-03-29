package com.guigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @title:
 * @description:
 * @author:王现崎
 * @date:2020/3/25 17:27
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T> {
    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}