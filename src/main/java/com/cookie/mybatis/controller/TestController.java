package com.cookie.mybatis.controller;

import com.cookie.mybatis.mapper.RunoobMapper;
import com.cookie.mybatis.model.Runoob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired(required = false)
    private RunoobMapper runoobMapper;

    @RequestMapping(value = "/getRunoob", method = RequestMethod.GET)
    public Runoob getDetail(Integer id) {
        Runoob runoob = runoobMapper.selectByPrimaryKey(id);
        return runoob;
    }

    @RequestMapping(value = "/saveRunoob", method = RequestMethod.POST)
    public Boolean getDetail(@RequestBody Runoob runoob) {
        return runoobMapper.insertSelective(runoob) >= 1 ? true : false;
    }
}
