package com.kk.jpa;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by chengxin on 2017/6/23.
 */
@Slf4j
@SpringBootApplication
public class myJpaApplication {
    private static Logger logger = LoggerFactory.getLogger(myJpaApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(myJpaApplication.class, args);
        logger.info("myJpaApplication start");
    }
}



