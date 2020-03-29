package com.guigu.springcloud.service.impl;

import com.guigu.springcloud.entities.Payment;
import com.guigu.springcloud.mapper.PaymentMapper;
import com.guigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @title:
 * @description:
 * @author:王现崎
 * @date:2020/3/25 17:19
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.selectByPrimaryKey(id);
    }
}