package com.example.learnlogback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogback {

    public static final Logger logger = LoggerFactory.getLogger(TestLogback.class);

    @Test
    public void test() {
        for (int i = 0; i < 100000; i++) {
            logger.error("error");
            logger.warn("warn");
            logger.info("info");
            logger.debug("debug");
            logger.trace("trace");
            String name = "itheima";
            int age = 20;
            logger.info("用户:{},{}", name, age);
        }
    }
}
