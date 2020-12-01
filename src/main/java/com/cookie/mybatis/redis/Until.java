package com.cookie.mybatis.redis;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cookie
 * @version 1.0
 * @date 2020/12/01 13:59
 */
public class Until {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mxy");
        list.add("StringUtils");
        list.add("join");
        String join = StringUtils.join(list,"-");//传入String类型的List集合，使用"-"号拼接
        System.out.println(join);

        String[] s = new String[]{"Yuan","Mxy"};//传入String类型的数组，使用"-"号拼接
        String join2 = StringUtils.join(s,"-");
        System.out.println(join2);
        String weeewewew = StringUtils.join("weeewewew", "011");
        System.out.println("weeewewew = " + weeewewew);
    }
}
