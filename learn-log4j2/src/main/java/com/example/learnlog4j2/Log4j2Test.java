package com.example.learnlog4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


public class Log4j2Test {
    public static final Logger logger = LogManager.getLogger(Log4j2Test.class);

    @Test
    public void test() {
        logger.fatal("fatal");
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }
}
