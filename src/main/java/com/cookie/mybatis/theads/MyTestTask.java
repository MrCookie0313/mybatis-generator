package com.cookie.mybatis.theads;

import java.time.LocalDateTime;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/08/24 9:54
 */
public class MyTestTask  implements Runnable{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("currentThread name =  ," + name+"time ={} "+LocalDateTime.now().toString());
    }
}
