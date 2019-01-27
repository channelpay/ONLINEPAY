package com.example.adminerver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
/**
 * 服务管理中心
 * @author ONEC
 *
 */
@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class AdminSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminSeverApplication.class, args);
	}
	
	
}
