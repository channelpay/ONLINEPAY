package com.example.eurekaclinte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 
 * @author ONEC
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringClinteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClinteApplication.class, args);
	}
}
