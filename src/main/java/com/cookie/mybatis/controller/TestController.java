package com.cookie.mybatis.controller;

import com.cookie.mybatis.mapper.OrderMapper;
import com.cookie.mybatis.mapper.RunoobMapper;
import com.cookie.mybatis.model.Order;
import com.cookie.mybatis.model.PageBean;
import com.cookie.mybatis.model.Runoob;
import com.cookie.mybatis.service.BatchServiceImpl;
import com.cookie.mybatis.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {
    @Autowired(required = false)
    private RunoobMapper runoobMapper;

    @Autowired(required = false)
    private OrderMapper orderMapper;

    @Autowired
    private BatchServiceImpl batchService;


    @Autowired
    private OrderService orderService;
    @RequestMapping(value = "/getRunoob", method = RequestMethod.GET)
    public Runoob getDetail(Integer id) {
        Runoob runoob = runoobMapper.selectByPrimaryKey(id);
        return runoob;
    }

    @RequestMapping(value = "/saveRunoob", method = RequestMethod.POST)
    public Boolean getDetail(@RequestBody Runoob runoob) {
        return runoobMapper.insertSelective(runoob) >= 1 ? true : false;
    }

    @RequestMapping(value = "/getAllInfo", method = RequestMethod.GET)
    public Order getAllInfo(String id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/getInfoIds", method = RequestMethod.GET)
    public List<Order> getAllInfo(@RequestParam(value = "ids") List<String> ids) {

        return batchService.selectByBatch(ids);
    }
    @RequestMapping(value = "/getOrderAll", method = RequestMethod.GET)
    public PageBean<Order> getAllInfo() {
        PageHelper.startPage(5,10);
        List<Order> orders = orderMapper.selectByPage();
        PageInfo<Order> pageInfo= new PageInfo<>(orders);
        return new PageBean<>(pageInfo);
    }
}
