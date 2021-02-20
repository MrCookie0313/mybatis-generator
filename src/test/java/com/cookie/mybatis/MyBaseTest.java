package com.cookie.mybatis;

/**
 * @Author: zgd
 * @Date: 18/09/29 21:14
 * @Description:
 */

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: zgd
 * @Date: 18/09/29 20:33
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisGeneratorApplication.class)
@Slf4j
public class MyBaseTest {


  @Before
  public void init() {
    log.info("----------------测试开始---------------");
  }

  @After
  public void after() {
    log.info("----------------测试结束---------------");
  }

}


