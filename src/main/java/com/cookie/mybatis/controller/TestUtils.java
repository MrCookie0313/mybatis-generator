package com.cookie.mybatis.controller;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.springframework.retry.RecoveryCallback;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.backoff.ExponentialBackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

public class TestUtils {
    public static void main(String[] args) throws Exception {
        new TestUtils().sendMsg("", null, null);
    }
       public  void sendMsg(String msg,String phone,String[] arr) throws Exception{
               
               RetryTemplate template = new RetryTemplate();
               // 策略
               SimpleRetryPolicy policy = new SimpleRetryPolicy();
               policy.setMaxAttempts(20);
               template.setRetryPolicy(policy);
             
               ExponentialBackOffPolicy   exponen = new ExponentialBackOffPolicy();
               exponen.setInitialInterval(1000);
               exponen.setMultiplier(2);
               template.setBackOffPolicy(exponen);
               String result = template.execute(
                       new RetryCallback<String, Exception>() {
                           @Override
                           public String doWithRetry(RetryContext arg0) throws Exception {
                               try {
                                   if(1==1){
                                       System.out.println(123);
                                       throw new Exception();                                       
                                   }
                            } catch (Exception e) {
                                // TODO Auto-generated catch block
                                throw new Exception();
                            }
                              return "";
                           }
                       }
                       ,
                       new RecoveryCallback<String>() {
                           @Override
                           public String recover(RetryContext context) {
                               return "recovery callback";
                           }
                       }
               );
           }
}