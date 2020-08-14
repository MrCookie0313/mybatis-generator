package com.cookie.mybatis.service;

import com.cookie.mybatis.model.Order;
import org.springframework.stereotype.Service;

import java.util.concurrent.Callable;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/6/19 0019
 */
public class CallableServiceImpl implements Callable<Order> {

    private String id;
    private OrderService orderService;

    public CallableServiceImpl(String id, OrderService orderService) {
        this.id = id;
        this.orderService = orderService;
    }

    @Override
    public Order call() throws Exception {
        return orderService.selectById(id);
    }
}
