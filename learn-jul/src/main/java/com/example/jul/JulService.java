package com.example.jul;

import java.io.IOException;
import java.util.logging.*;

public class JulService {
    
    public void test1(){
        Logger logger = Logger.getLogger("abc");
        logger.log(Level.FINEST, "finest log");
        logger.log(Level.FINER, "finer log");
        logger.log(Level.FINE, "fine log");
        logger.log(Level.CONFIG, "config log");
        logger.log(Level.INFO, "info log");
        logger.log(Level.WARNING, "warning log");
        logger.log(Level.SEVERE, "severe log");
        logger.warning( "warning log");
    }

    static LogManager logManager = LogManager.getLogManager();
    static {
        try {
            logManager.readConfiguration(JulService.class.getClassLoader().getResourceAsStream("logging.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void testJul(){
        String name = JulService.class.getName();
        System.out.println(name);
        Logger logger = Logger.getLogger(name);
       // logger.setLevel(Level.ALL);
        Handler[] handlers = logger.getParent().getHandlers();
        for (Handler handler : handlers) {
     //       handler.setLevel(Level.ALL);
        }
        logger.log(Level.FINEST, "finest log");
        logger.log(Level.FINER, "finer log");
        logger.log(Level.FINE, "fine log");
        logger.log(Level.CONFIG, "config log");
        logger.log(Level.INFO, "info log");
        logger.log(Level.WARNING, "warning log");
        logger.log(Level.SEVERE, "severe log");
        logger.warning( "warning log");
    }
}
