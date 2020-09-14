//package com.cookie.mybatis.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.client.BufferingClientHttpRequestFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Arrays;
//
///**
// * @author gzy
// * @date 2020/5/12 13:57
// */
//@Component
//public class RestTemplateConfig {
//    @Bean
//    public RestTemplate restTemplate() {
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(new SkipSslVerificationHttpRequestFactory()));
//        restTemplate.setInterceptors(Arrays.asList(new RestTemplateInterceptor()));
//        return restTemplate;
//    }
//}
