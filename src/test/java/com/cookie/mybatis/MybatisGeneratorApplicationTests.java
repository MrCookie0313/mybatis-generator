package com.cookie.mybatis;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

}
