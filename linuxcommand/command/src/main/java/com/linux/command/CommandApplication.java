package com.linux.command;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Auther: fengchunping
 * @Date: 2019/3/19 09:53
 * @Description:
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class CommandApplication {
    public static void main(String[] args){
        SpringApplication.run(CommandApplication.class,args);
    }
}
