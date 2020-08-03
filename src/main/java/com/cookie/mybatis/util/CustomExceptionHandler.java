package com.cookie.mybatis.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;

/**
 * @author sunbing_vendor
 */
@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(RestClientException.class)
    public ResponseEntity<String> throwRestException(RestClientException restClientException){
        return new ResponseEntity<String>(restClientException.getMessage(),
                HttpStatus.BAD_REQUEST);
    }
}