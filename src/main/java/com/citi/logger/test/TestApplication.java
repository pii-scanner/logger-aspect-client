package com.citi.logger.test;

import com.citi.cpb.logger.aspect.Allow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestApplication {

    private static Logger logger = LoggerFactory.getLogger(TestApplication.class);

    public static void main(String[] args){
        TestApplication app = new TestApplication();
        app.run();
    }

    public void run(){
        logger.info("logging something");

        logger.info("logging something with basic parameters - {}",
                "this_is_not_allowed");

        logger.info("logging something with basic parameters - {},{},{},{},{}",
                "this_is_not_allowed",1,12L,12.34D,true);

        logger.info("logging something with basic parameters - {},{},{},{},{}",
                new Allow("this_is_not_allowed"),new Allow(1),new Allow(12L),new Allow(12.34D),true);

        logger.info("logging object - {}", new TestObjPii("my_name"));

        logger.info("logging object - {}, {}, {}", new TestObjNoPii("my_name"), "test1", "test2");
    }
}
