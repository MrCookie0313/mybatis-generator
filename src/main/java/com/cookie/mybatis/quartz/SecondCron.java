//package com.cookie.mybatis.quartz;
//
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;
//import org.springframework.scheduling.quartz.QuartzJobBean;
//
//import java.util.Date;
//
///**
// * @author sunBing
// * @version 1.0
// * @date 2020/8/14 0014
// */
//public class SecondCron extends QuartzJobBean {
//    @Override
//    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        String msg = (String) jobExecutionContext.getJobDetail().getJobDataMap().get("msg");
//        System.out.println("quartz Task "+ new Date() + msg);
//    }
//}
