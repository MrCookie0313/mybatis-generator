package com.cookie.mybatis.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author sunbing
 */
@ApiModel("定时任务操作VO")
@Data
public class QuartzBean {
    /**
     * 任务id
     */
    private String id;

    /**
     * 任务名称
     */
    private String jobName;

    /**
     * 任务执行类
     */
    private String jobClass;

    /**
     * 任务状态 启动还是暂停
     */
    private Integer status;

    /**
     * 任务运行时间表达式
     */
    private String cronExpression;

}
