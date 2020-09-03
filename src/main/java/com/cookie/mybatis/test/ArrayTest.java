package com.cookie.mybatis.test;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/08/31 19:27
 */
public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("22");
        arrayList.add("23");
        arrayList.add("24");
        String[] strings = arrayList.toArray(new String[0]);
        System.out.println("strings = " + JSON.toJSONString(strings));
    }
}
