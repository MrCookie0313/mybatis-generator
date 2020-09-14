package com.cookie.mybatis.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.time.LocalDateTime;
import java.util.Date;
@Slf4j
public class MyTask1 extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        //TODO 这里写定时任务的执行逻辑
        System.out.println("动态的定时任务执行时间：" + new Date().toLocaleString());
        log.info("动态的定时任务执行时间:{}", LocalDateTime.now());
    }
}
