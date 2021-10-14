package com.example.learnlog4j;

import org.apache.log4j.Logger;

public class Log4jService {
    private static Logger logger = Logger.getLogger(Log4jService.class);
    public void test() {
        logger.trace("trade");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");
    }
}
