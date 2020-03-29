package com.guigu.springcloud.service;

import com.guigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @title:
 * @description:
 * @author:王现崎
 * @date:2020/3/25 17:18
 **/

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id")Long id);
}