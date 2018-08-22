package com.douyu.aoligouzi;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages = {"com.douyu"})
@MapperScan("com.douyu.aoligouzi,Dao")
public class AoligouziApplication {
    private static Logger logger = LoggerFactory.getLogger(AoligouziApplication.class);

    public static void main(String[] args) {
        logger.info("=================开始成功=================");
        SpringApplication.run(AoligouziApplication.class, args);
        logger.info("=================启动成功=================");
    }
}
