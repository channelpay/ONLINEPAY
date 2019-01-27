package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 服务注册中心
 * @author ONEC
 *
 */
@EnableEurekaServer 
@SpringBootApplication
public class EurekaSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSeverApplication.class, args);
	}
}
