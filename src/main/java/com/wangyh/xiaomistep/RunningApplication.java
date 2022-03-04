package com.wangyh.xiaomistep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动类
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class RunningApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunningApplication.class, args);
    }

}
