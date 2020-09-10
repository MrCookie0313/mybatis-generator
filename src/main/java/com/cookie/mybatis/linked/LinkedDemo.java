package com.cookie.mybatis.linked;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/09/09 15:50
 */
public class LinkedDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        ConcurrentLinkedQueue<List<String>> strings = new ConcurrentLinkedQueue<>();
        ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
        queue.offer("哈哈哈");
        queue.offer("嘻嘻嘻");
//        System.out.println("offer后，队列是否空？" + queue.isEmpty());
//        System.out.println("从队列中poll：" + queue.poll());
//        String poll = (String)queue.poll();
//        System.out.println("poll = " + poll);;
//        System.out.println("pool后，队列是否空？" + queue.isEmpty());
        Object peek = queue.peek();
        System.out.println("peek = " + peek);
//        queue.remove("哈哈哈");
        Object peek1 = queue.peek();
        System.out.println("peek1 = " + peek1);
        int size = queue.size();
        System.out.println("size = " + size);
        boolean boo = queue.contains("嘻嘻嘻");
        System.out.println("boo = " + boo);
    }
}
