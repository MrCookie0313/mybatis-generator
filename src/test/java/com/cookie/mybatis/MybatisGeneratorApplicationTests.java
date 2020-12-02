package com.cookie.mybatis;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class MybatisGeneratorApplicationTests {

    @Value("${timeout.betting}")
    private int BETTING;

    @Value("${timeout.gaming}")
    private int GAMING;

    @Value("${timeout.ad}")
    private List<String> ad;

    @Value("${imageFace.config.minScore}")
    private double minScore;


    @Test
    void contextLoads() {
        System.out.println("BETTING = " + BETTING);
        System.out.println("GAMING = " + GAMING);
        System.out.println("ad"+JSON.toJSONString(minScore));

    }

    @Test
    void getTest(){

    }

    @Test
    public void st() {
        String regex;
        Pattern p;
        Matcher m;
        List<String> list = new ArrayList();
        list.add("aa");
        list.add("aa");
        list.add("aa");
        list.add("aa");
        list.add("bb");
        list.add("bb");
        list.add("cc");
        list.add("cc");
        list.add("dd");
        list.add("ed");
        String tmp = "";
        String tot_str = list.toString();
        //System.out.println(tot_str);   //[aa, aa, aa, aa, bb, bb, cc, cc, dd, ed]
        int max_cnt = 0;
        String max_str = "";
        for(String str : list) {
            if (tmp.equals(str)) continue;
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
    }


}
