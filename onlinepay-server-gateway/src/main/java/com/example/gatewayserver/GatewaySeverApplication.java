package com.example.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 服务注册中心
 * @author ONEC
 *  springcould 2.0 已经不建议集成zuul2// 建议使用getaway
 */
@SpringBootApplication
public class GatewaySeverApplication {  

    public static void main(String[] args) {
        SpringApplication.run(GatewaySeverApplication.class, args);
    }
}
