package com.cookie.mybatis.service;

import com.cookie.mybatis.model.Order;

import java.util.List;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/6/19 0019
 */
public interface OrderService {

    Order selectById(String id);


}
