package com.cookie.mybatis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisGeneratorApplicationTests {

    @Value("${timeout.betting}")
    private int BETTING;

    @Value("${timeout.gaming}")
    private int GAMING;

    @Test
    void contextLoads() {
        System.out.println("test");
        System.out.println("BETTING = " + BETTING);
        System.out.println("GAMING = " + GAMING);

    }

}
