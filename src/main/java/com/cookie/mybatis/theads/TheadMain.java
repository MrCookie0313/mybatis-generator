package com.cookie.mybatis.theads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/08/24 9:57
 */
public class TheadMain {
    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,10,5, TimeUnit.SECONDS,new ArrayBlockingQueue<>(12));
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(new MyTestTask());
        }
    }
}
