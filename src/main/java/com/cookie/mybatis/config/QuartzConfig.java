package com.cookie.mybatis.config;

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
    public JobDetail teatQuartDetail() {
        return JobBuilder.newJob(SecondCron.class).withIdentity("secondCron").storeDurably().build();
    }

    @Bean
    public Trigger testQuartzTrigger() {
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/10 * * * * ?");
        return TriggerBuilder.newTrigger()
                //关联上述的JobDetail
                .forJob(teatQuartDetail())
                .withIdentity("secondCron")
                .withSchedule(cronScheduleBuilder)
                .build();
    }

}
