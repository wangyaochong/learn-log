package com.example.jul;


import org.junit.Test;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JulServiceTest {

    @Test
    public void testJul(){
        JulService julService = new JulService();
        julService.testJul();
    }


    @Test
    public void test() {

        JulService julService = new JulService();
        julService.test1();
    }


    @Test
    public void testLog() {
        Logger logger = Logger.getLogger("abc");
        logger.setLevel(Level.ALL);
        Handler[] handlers = logger.getParent().getHandlers();
        for (Handler handler : handlers) {
            handler.setLevel(Level.ALL);
        }

        logger.log(Level.FINEST, "finest log");
        logger.log(Level.FINER, "finer log");
        logger.log(Level.FINE, "fine log");
        logger.log(Level.CONFIG, "config log");
        logger.log(Level.INFO, "fine log");
        logger.log(Level.WARNING, "warning log");
        logger.log(Level.SEVERE, "severe log");
        logger.warning("warning log");
    }

    @Test
    public void testLogParent() {
        Logger logger1 = Logger.getLogger("a");
        Logger logger2 = Logger.getLogger("a.b");
        Logger logger3 = Logger.getLogger("a.b.c");

        System.out.println(logger3.getParent().getName());
        System.out.println(logger2.getParent().getName());
    }


    @Test
    public void testAddHandler(){
        Logger logger = Logger.getLogger("newLogger");
        logger.addHandler(new ConsoleHandler());
        logger.info("测试日志重复输出");

        logger.setUseParentHandlers(false);
        logger.info("测试日志重复输出2");
    }
}
