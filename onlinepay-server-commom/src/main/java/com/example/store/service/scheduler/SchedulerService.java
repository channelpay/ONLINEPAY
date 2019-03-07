package com.example.store.service.scheduler;

import java.time.LocalDateTime;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 任务调度服务类
 * 
 * @author ONEC
 *
 */
@Component
public class SchedulerService {

    @Scheduled(cron = "0 * 10 * * ?")
    public void cornJobFind() {

        System.out.println("springboot 定时任务启动：" + LocalDateTime.now());
    }

    /**
     * 固定一个时间值执行任务，不受前一个任务影响：1000 = 1s
     * @param fixedRate :1000 每隔1000ms 执行一次
     */
    @Scheduled(fixedRate = 1000)
    public void fixRateSch() {
        System.out.println("springboot 每隔1s 执行调度：（不受前一个任务的影响）:" + LocalDateTime.now());
    }

    /**
     * 固定延时：当前一个任务完成之后，延时一段时间，执行下一个任务
     * @param initialDelay :初始延时2000 ms 后执行
     * @param fixedDelay ：前一任务完成：延时3000 ms 执行
     */
    @Scheduled(fixedDelay = 3000, initialDelay = 2000)
    public void fixDelaySch() {
        System.out.println("springboot 每隔3s 执行调度：（前一个任务完成执行）:" + LocalDateTime.now());
    }
}
