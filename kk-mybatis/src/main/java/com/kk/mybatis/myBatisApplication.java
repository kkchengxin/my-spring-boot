package com.kk.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by chengxin on 2017/6/23.
 */
@Slf4j
@SpringBootApplication
public class myBatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(myBatisApplication.class, args);
        log.info("myBatisApplication start");
    }
}
