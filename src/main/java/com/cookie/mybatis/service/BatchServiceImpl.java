package com.cookie.mybatis.service;

import com.cookie.mybatis.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/6/19 0019
 */
@Service
public class BatchServiceImpl {

    @Autowired
    private OrderService orderService;
    private   ThreadPoolExecutor executor = new ThreadPoolExecutor(3,5,30, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10),new ThreadPoolExecutor.DiscardPolicy());


    public List<Order> selectByBatch(List<String> ids) {
        // 创建线程池
        ExecutorService exec = Executors.newFixedThreadPool(10);
        ArrayList<Order> orders = new ArrayList<>();
        //创建任务集合
        List<Future<Order>> taskList= new ArrayList<>();

        for (String id : ids) {
            FutureTask<Order> futureTask= new FutureTask<>(new CallableServiceImpl(id,orderService));
            taskList.add(futureTask);
            exec.submit(futureTask);
        }
        Order order=null;
        for (Future<Order> task : taskList) {
            try {
                order=task.get();
                if (order!=null){
                    orders.add(order);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        exec.shutdown();
        return orders;
    }
}
