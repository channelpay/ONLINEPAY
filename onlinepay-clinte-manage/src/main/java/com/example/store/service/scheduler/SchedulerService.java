package com.example.store.service.scheduler;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
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

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JavaMailSender javaMailSender;

    @Scheduled(cron = "0 * 10 * * ?")
    public void cornJobFind() {

        logger.info("springboot 定时任务启动：" + LocalDateTime.now());
    }

    /**
     * 固定一个时间值执行任务，不受前一个任务影响：1000 = 1s
     * @param  :1000 每隔1000ms 执行一次
     */
    @Scheduled(fixedRate = 1000)
    public void fixRateSch() {
        logger.info("springboot 每隔1s 执行调度：（不受前一个任务的影响）:" + LocalDateTime.now());
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("2650020302@qq.com");
        simpleMailMessage.setTo("caorc@feifanzhichuang.com");
        simpleMailMessage.setSubject("主题：这是个简单的邮件：");
        simpleMailMessage.setText("邮件类容");
        javaMailSender.send(simpleMailMessage);
        logger.info("the test is :{}","邮件第一次发送");
    }

    /**
     * 固定延时：当前一个任务完成之后，延时一段时间，执行下一个任务
     * @param  :初始延时2000 ms 后执行
     * @param  ：前一任务完成：延时3000 ms 执行
     */
    @Scheduled(fixedDelay = 3000, initialDelay = 2000)
    public void fixDelaySch() {
        logger.info("springboot 每隔3s 执行调度：（前一个任务完成执行）:" + LocalDateTime.now());
    }
}
