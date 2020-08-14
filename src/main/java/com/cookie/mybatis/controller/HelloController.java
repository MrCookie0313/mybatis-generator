package com.cookie.mybatis.controller;

import com.alibaba.fastjson.JSON;
import com.cookie.mybatis.model.UserDto2;
import com.cookie.mybatis.service.RemoteService;
import com.cookie.mybatis.service.UserService;
import jdk.nashorn.internal.runtime.JSONFunctions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

/**
 * @author sunbing_vendor
 */
@Slf4j
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
    @PostMapping(value = "/file1")
    public String file1(@RequestPart(name = "file1") MultipartFile multipartFile) {
        String content = String.format("name = %s,originName = %s,size = %d",
                multipartFile.getName(), multipartFile.getOriginalFilename(), multipartFile.getSize());
        log.info(content);
        return content;
    }

    @PostMapping(value = "/localDate")
    public String dateTest(@RequestBody UserDto2 userDto2) {
        System.out.println("userDto2 = " + userDto2);
        return "Success";
    }
    @PostMapping(value = "/localDate2")
    public UserDto2 ttt(@RequestBody UserDto2 userDto2) {
        System.out.println("userDto2 = " + userDto2);
        return userDto2;
    }


    public static void main(String[] args) {
        UserDto2 userDto2 = new UserDto2();
        userDto2.setUserId("313312");
        userDto2.setBirthdayTime(LocalDateTime.now());
        userDto2.setGraduationTime(LocalDateTime.now());
        System.out.println("userDto2 = " +userDto2);
        System.out.println("userDTO="+ JSON.toJSONString(userDto2));
    }

}