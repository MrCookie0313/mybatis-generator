package com.cookie.mybatis.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author Cookie
 * @version 1.0
 * @date 2020/11/24 11:05
 */
@Service
@Slf4j
public class RedisService implements ApplicationRunner {
    @Autowired
    private RedisDelayedQueue redisDelayedQueue;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //添加需要延迟的DTO

        TaskBodyDTO taskBody = new TaskBodyDTO();
        taskBody.setBody("测试DTO实体类的BODY,3秒之后执行");
        taskBody.setName("测试DTO实体类的姓名,3秒之后执行");
        //添加队列3秒之后执行
        redisDelayedQueue.addQueue(taskBody, 3, TimeUnit.SECONDS);
        taskBody.setBody("测试DTO实体类的BODY,10秒之后执行");
        taskBody.setName("测试DTO实体类的姓名,10秒之后执行");
        //添加队列10秒之后执行
        redisDelayedQueue.addQueue(taskBody, 10, TimeUnit.SECONDS);
        taskBody.setBody("测试DTO实体类的BODY,20秒之后执行");
        taskBody.setName("测试DTO实体类的姓名,20秒之后执行");
        //添加队列20秒之后执行
        redisDelayedQueue.addQueue(taskBody, 20, TimeUnit.SECONDS);





        //监听延迟队列
        RedisDelayedQueue.TaskEventListener<TaskBodyDTO> taskEventListener = new RedisDelayedQueue.TaskEventListener<TaskBodyDTO>() {
            @Override
            public void invoke(TaskBodyDTO taskBodyDTO) {
                //这里调用你延迟之后的代码
                log.info("执行...." + taskBodyDTO.getBody() + "===" + taskBodyDTO.getName());
            }
        };
        redisDelayedQueue.getQueue(TaskBodyDTO.class, taskEventListener);
    }
}
