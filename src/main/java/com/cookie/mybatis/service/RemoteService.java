package com.cookie.mybatis.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
@Slf4j
@Service
public class RemoteService {

    
    @Retryable(value = { RemoteAccessException.class }, maxAttempts = 3, backoff = @Backoff(delay = 5000L, multiplier = 1))
    public void call() throws Exception {
        log.info(LocalTime.now()+" do something...");
        throw new RemoteAccessException("RPC调用异常");
    }
 
    @Recover
    public void recover(RemoteAccessException e) {
        log.info(e.getMessage());
    }
}
