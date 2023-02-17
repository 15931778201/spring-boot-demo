package com.example.springbootaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@SpringBootApplication
@MapperScan("com.example.mapper")
public class SpringbootActionApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringbootActionApplication.class);


    public static void main(String[] args) {
        if(logger.isDebugEnabled()) {
            logger.debug("SpringBoot starting...");
        }

        SpringApplication.run(SpringbootActionApplication.class, args);
    }
}