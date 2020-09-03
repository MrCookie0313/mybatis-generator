package com.cookie.mybatis.mapper;

import com.cookie.mybatis.model.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String orderId);

    List<Order> selectByPage();

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}