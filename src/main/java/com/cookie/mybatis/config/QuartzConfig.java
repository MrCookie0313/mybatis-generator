package com.cookie.mybatis.config;

import com.cookie.mybatis.quartz.DateTimeJob;
import com.cookie.mybatis.quartz.SecondCron;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/8/14 0014
 */
@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail teatQuartDetail(){
        return JobBuilder.newJob(SecondCron.class).withIdentity("secondCron").storeDurably().build();
    }
    @Bean
    public Trigger testQuartzTrigger(){
        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever();
        return TriggerBuilder.newTrigger().forJob(teatQuartDetail()).withIdentity("secondCron").withSchedule(simpleScheduleBuilder).build();
    }
    @Bean
    public JobDetail printTimeJobDetail(){
        return JobBuilder.newJob(DateTimeJob.class)
                .withIdentity("DateTimeJob")
                .usingJobData("msg","Hello Quartz")
                .storeDurably()
                .build();

    }
    @Bean
    public  Trigger printTimeJobTrigger(){
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/1 * * * * ?");
        return TriggerBuilder.newTrigger()
                .forJob(printTimeJobDetail())
                .withIdentity("quartzTaskService")
                .withSchedule(cronScheduleBuilder)
                .build();
    }

}
