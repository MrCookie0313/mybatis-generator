package com.cookie.mybatis.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * @author sunbing_vendor
 */
@Service
@Slf4j
public class UserService {
  
    @Autowired
    private RestTemplate restTemplate;
  
    @Retryable(value = RestClientException.class, maxAttempts = 3,
            backoff = @Backoff(delay = 5000L,multiplier = 1))
    public String getInfo() {
        String url = "http://localhost:8080/ds";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        // 判断请求是否发生异常
        if(!responseEntity.getStatusCode().is2xxSuccessful()){
            System.out.println("请求失败...");
            log.info("请求失败...");
            // 抛出异常
            throw new RestClientException(responseEntity.getBody());
        }
        // 没有异常的话则返回正常的响应结果
        return responseEntity.getBody();
    }
}