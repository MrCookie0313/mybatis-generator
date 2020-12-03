package com.cookie.mybatis.test;

import com.alibaba.fastjson.JSON;
import com.cookie.mybatis.model.Chip;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        ArrayList<Chip> chips = new ArrayList<>();
        Chip chip = new Chip();
        chip.setCount(9);
        chip.setDenomination(1000);
        chip.setType("$美元");
        chips.add(chip);
//        Chip chip1 = new Chip();
//        chip1.setCount(10);
//        chip1.setDenomination(1000);
//        chip1.setType("$美元");
//        chips.add(chip1);
//        Chip chip2 = new Chip();
//        chip2.setCount(9);
//        chip2.setDenomination(1000);
//        chip2.setType("$美元");
//        chips.add(chip2);
        ArrayList<String> countList = new ArrayList<>();
        for (Chip chipr : chips) {
            countList.add(String.valueOf(chipr.getCount()));
        }
        double maxCount = getMaxCount(countList);
        System.out.println("maxCount = " + maxCount);
        for (Chip chip3 : chips) {
            if (chip3.getCount()==maxCount){
                System.out.println("JSON.toJSONString(chip3) = " + JSON.toJSONString(chip3));
                break;
            }
        }
    }
    private static double getMaxCount(ArrayList<String> countList) {
        String regex;
        Pattern p;
        Matcher m;
        String tmp = "";
        String tot_str = countList.toString();
        int max_cnt = 0;
        String max_str = "";
        for(String str : countList) {
            if (tmp.equals(str)) {
                continue;
            }
            tmp = str;
            regex = str;
            p = Pattern.compile(regex);
            m = p.matcher(tot_str);
            int cnt = 0;
            while(m.find()) {
                cnt++;
            }
            //System.out.println(str + ":" + cnt);
            if (cnt > max_cnt) {
                max_cnt = cnt;
                max_str = str;
            }
        }
        System.out.println("字符串 " + max_str + " 出现的最大次数："+ max_cnt) ;  //字符串 aa 出现的最大次数：4
        return Double.valueOf(max_str);

    }
}
