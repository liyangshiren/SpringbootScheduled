package com.li.scheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling //开启定时任务
@EnableAsync  // 启动异步注解
@SpringBootApplication
public class ScheduledApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduledApplication.class, args);
    }

}
