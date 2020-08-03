package com.cookie.mybatis.controller;

import com.cookie.mybatis.service.RemoteService;
import com.cookie.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunbing_vendor
 */
@RestController
public class HelloController {
  
    @Autowired
    private UserService userService;
    @Autowired
    private RemoteService remoteService;
  
    @GetMapping("/test")
    public String test() {
        return userService.getInfo();
    }

    @RequestMapping("/show")
    public String show(){
        try {
            remoteService.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Hello World";
    }

}