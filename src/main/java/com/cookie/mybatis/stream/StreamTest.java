package com.cookie.mybatis.stream;

import com.cookie.mybatis.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/8/3 0003
 */
public class StreamTest {
    public static void main(String[] args) {
        ArrayList<UserInfo> list  = new ArrayList<>();
        ArrayList<UserInfo> info  = new ArrayList<>();
        UserInfo info0 = UserInfo.builder().id(1)
                .name("zhangsan")
                .sex(20L).build();
        UserInfo info1 = UserInfo.builder().id(2)
                .name("zhangsan2")
                .sex(21L).build();

        UserInfo info2 = UserInfo.builder().id(3)
                .name("李四")
                .sex(25L).build();

        UserInfo info3 = UserInfo.builder().id(3)
                .name("老王")
                .sex(35L).build();

        list.add(info0);
        list.add(info1);
        list.add(info3);

        info.add(info1);
        info.add(info2);
        info.add(info3);
        //交集

        List<UserInfo> infoList = info.stream().filter(u -> list.stream().map(e -> e.getName()).collect(Collectors.toList()).contains(u.getName())).collect(Collectors.toList());
        System.out.println(infoList);


    }
}
