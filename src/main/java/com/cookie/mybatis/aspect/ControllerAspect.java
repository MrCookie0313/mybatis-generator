package com.cookie.mybatis.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @Author guozhiyang1_vendor
 * @Date 2020/9/4 13:42
 * @Version 1.0
 */
@Slf4j
@Aspect
@Component
public class ControllerAspect {
    @Pointcut("execution(* com.cookie.mybatis.controller.*.*(..))")
    public void param(){}

    @Around("param()")
    public void handleControllerMethod(ProceedingJoinPoint pjp) throws Throwable {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        log.info("===============request contexts===============");
        log.info("request url:" + request.getRequestURL().toString());
        log.info("request method:" + request.getMethod());
        log.info("Controller begin: " + pjp.getSignature() + " params：" + Arrays.toString(pjp.getArgs()));
    }
}
