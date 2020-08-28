package com.cookie.mybatis.quartz;

import com.alibaba.fastjson.JSON;
import com.cookie.mybatis.mapper.OrderMapper;
import com.cookie.mybatis.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/8/18 0018
 */
@Slf4j
public class MyTask extends QuartzJobBean {

    @Autowired
    private OrderMapper orderMapper;
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Order order = orderMapper.selectByPrimaryKey("1672456278376448");
        System.out.println("current time :"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "---");
        log.info("order detail is {} ", JSON.toJSONString(order));
    }
}
