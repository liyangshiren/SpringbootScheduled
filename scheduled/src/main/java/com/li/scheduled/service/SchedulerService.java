package com.li.scheduled.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

    /**
     * second,minute,hour,day of month,month and day of week
     * 秒，分，时，日，月，周几
     * 0 * * * * MON-FRI
     * 每周一到周五的都每分钟的0秒会执行一次
     */
    @Scheduled(cron = "0 * * * * *") // 每分钟执行一次
    public void schedulerMethod(){
        System.out.println("定时任务每分钟执行一次。。。");
    }

    @Scheduled(cron = "1 * * * * *") // 每秒钟执行一次
    public void schedulerMethod2(){
        System.out.println("定时任务每秒执行一次。。。");
    }

    @Scheduled(cron = "0,1,2,3,4,5 * * * * *") // 每分钟的第0，1，2，3，4，5秒都会执行一次,枚举
    public void schedulerMethod3(){
        System.out.println("定时任务每分钟前5秒执行执行5次。。。");
    }

    @Scheduled(cron = "40-59 * * * * *") // 每分钟的第40-59秒会执行
    public void schedulerMethod4(){
        System.out.println("每分钟的第40-59秒会执行。。。");
    }
    /**
     *     @Scheduled(cron = "0/4 * * * * *") // 每4秒执行一次
     *     "0 0/5 14 18 * * ?" // 每天14点整、18点整、每隔5分钟执行一次
     *     "0 15 10 ? * 1-6" // 每个月的周一至周六10:15分执行一次
     *     "0 0 2 ? * 6L" // 每个月的最后一个周六凌晨2点执行一次
     *     "0 0 2 LW * ？" // 每个月的最后一个工作日凌晨2点执行一次
     *     "0 0 2-4 ? * 1#1" // 每个月的第一个周一凌晨2点到4点期间，每个整点都会执行一次
     *
     */
}
