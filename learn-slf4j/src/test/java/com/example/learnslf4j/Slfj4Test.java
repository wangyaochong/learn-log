package com.example.learnslf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slfj4Test {
    public static final Logger logger = LoggerFactory.getLogger(Slfj4Test.class);

    @Test
    public void test() {
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");

        String name = "itheima";
        int age=20;
        logger.info("用户:{},{}",name,age);
    }
}
