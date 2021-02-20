package com.cookie.mybatis.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cookie
 * @version 1.0
 * @date 2021/01/26 11:41
 */
@RestController
public class NacosController {

    @Value("${config.user.name}")
    private String userName;

    @Value("${config.user.age}")
    private Integer age;

    @GetMapping("/get")
    public String getUserName(){
        String result= "我是"+userName+"今年"+age+"岁";
        return result;
    }

}
