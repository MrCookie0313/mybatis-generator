package com.cookie.mybatis.controller;

import com.alibaba.druid.sql.visitor.SQLASTOutputVisitor;
import com.cookie.mybatis.job.MyTask1;
import com.cookie.mybatis.model.QuartzBean;
import com.cookie.mybatis.quartz.QuartzUtils;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/quartz/")
@Slf4j
public class QuartzController {
    //注入任务调度
    @Autowired
    private Scheduler scheduler;

    @RequestMapping(value = "/createJob",method = RequestMethod.POST)
    @ResponseBody
    public String createJob(QuartzBean quartzBean) {
        try {

            String name = MyTask1.class.getPackage().getName();
            log.info("pageName:{}",name);
            //进行测试所以写死
            quartzBean.setJobClass("com.cookie.mybatis.job.MyTask1");
            quartzBean.setJobName("test1");
            quartzBean.setCronExpression("0/1 * * * * ?");
            QuartzUtils.createScheduleJob(scheduler, quartzBean);
        } catch (Exception e) {
            return "创建失败";
        }
        return "创建成功";
    }

    @RequestMapping(value = "/pauseJob",method = RequestMethod.POST)
    @ResponseBody
    public String pauseJob() {
        try {
            QuartzUtils.pauseScheduleJob(scheduler, "test1");
        } catch (Exception e) {
            return "暂停失败";
        }
        return "暂停成功";
    }

    @RequestMapping(value = "/runOnce",method = RequestMethod.POST)
    @ResponseBody
    public String runOnce() {
        try {
            QuartzUtils.runOnce(scheduler, "test1");
        } catch (Exception e) {
            return "运行一次失败";
        }
        return "运行一次成功";
    }

    @RequestMapping(value = "/resume",method = RequestMethod.POST)
    @ResponseBody
    public String resume() {
        try {

            QuartzUtils.resumeScheduleJob(scheduler, "test1");
        } catch (Exception e) {
            return "启动失败";
        }
        return "启动成功";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public String update(QuartzBean quartzBean) {
        try {
            //进行测试所以写死
            quartzBean.setJobClass("com.cookie.mybatis.job.MyTask1");
            quartzBean.setJobName("test1");
            quartzBean.setCronExpression("0/1 * * * * ?");
            QuartzUtils.updateScheduleJob(scheduler, quartzBean);
        } catch (Exception e) {
            return "启动失败";
        }
        return "启动成功";
    }
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public String delete(QuartzBean quartzBean) {
        try {
            //进行测试所以写死
            QuartzUtils.deleteScheduleJob(scheduler, "test1");
        } catch (Exception e) {
            return "启动失败";
        }
        return "启动成功";
    }

    public static void main(String[] args) {
        String name = MyTask1.class.getPackage().getName();
        System.out.println("name = " + name);
        String name1 = MyTask1.class.getName();
        //eg name = com.cookie.mybatis.job
        System.out.println("name1 = " + name1);
        //eg name1 = com.cookie.mybatis.job.MyTask1
    }
}
