package com.cookie.mybatis.service;

import com.cookie.mybatis.mapper.OrderMapper;
import com.cookie.mybatis.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/6/19 0019
 */
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired(required = false)
    private OrderMapper orderMapper;

    private static  final ThreadPoolExecutor executor = new ThreadPoolExecutor(3,10,3, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10),new ThreadPoolExecutor.DiscardPolicy());

    @Override
    public Order selectById(String id) {
        return orderMapper.selectByPrimaryKey(id);
    }
}
