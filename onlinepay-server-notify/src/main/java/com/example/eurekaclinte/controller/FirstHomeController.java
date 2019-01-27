package com.example.eurekaclinte.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author ONEC
 *
 */

@Slf4j
@RestController
@RefreshScope
@RequestMapping("/")
@DefaultProperties(defaultFallback = "defaultFallback") // 设置默认降级方法
public class FirstHomeController {

    @Value("${foo:config server not found}")
    private String product;

    /**
     * 简单的测试第一个springboot的项目
     * 
     * @return the first springboot demo
     */
    @RequestMapping("/testconfig")
    String home() {

        return "加载的springboot :" + product;
    }

    /**
     * 获取配置服务中的value
     * 
     * @param username
     * @param userphone
     * @return
     */
    String getUserNameFromUser(@RequestParam String username, String userphone) {

        return null;
    }

//    @RequestMapping("/product")
//    @HystrixCommand(fallbackMethod = "defaultFallback")
//    public String getProduct() {
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.exchange("localhost:8080", , requestEntity, responseType);
//        return product;
//
//    }

    /**
     * 默认降级方法
     * 
     * @return
     */
    private String defaultFallback() {
        System.out.println("请求失败：默认降级Z:");
        return product;
    }
}
