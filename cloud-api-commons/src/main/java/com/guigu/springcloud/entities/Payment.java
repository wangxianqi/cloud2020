package com.guigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @title:
 * @description:
 * @author:王现崎
 * @date:2020/3/25 17:28
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String serial;
}