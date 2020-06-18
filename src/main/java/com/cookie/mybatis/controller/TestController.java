package com.cookie.mybatis.controller;

import com.cookie.mybatis.mapper.OrderMapper;
import com.cookie.mybatis.mapper.RunoobMapper;
import com.cookie.mybatis.model.Order;
import com.cookie.mybatis.model.Runoob;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired(required = false)
    private RunoobMapper runoobMapper;

    @Autowired(required = false)
    private OrderMapper orderMapper;

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
}
