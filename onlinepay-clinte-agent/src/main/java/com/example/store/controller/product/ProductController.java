package com.example.store.controller.product;

import java.time.LocalDateTime;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.store.service.product.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("")
@DefaultProperties(defaultFallback = "defaultFallback")
public class ProductController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ProductService productService;


    @RequestMapping(value = "getProduct", method = {RequestMethod.POST, RequestMethod.GET})
    public ResponseEntity<Object> respProduct() {
        return new ResponseEntity<Object>(productService.findAllProduct(), HttpStatus.OK);
    }


    /**
     * 使用restTemplate get 方法 post 方法 put 方法 DELETE 方法
     * 
     * @return
     */
    @HystrixCommand(fallbackMethod = "productFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",
                    value = "3000"), // 超时
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), // 设置熔断, 某个服务单元发生问题
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")})
    @RequestMapping(value = "restTemplate", method = RequestMethod.GET)
    public String getProduct() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        System.out.println("请求到restTemplate ：" + LocalDateTime.now());
        return restTemplate
                .exchange("http://localhost:8080/getProduct", HttpMethod.GET, entity, String.class)
                .getBody();
    }

    /**
     * 默认熔断降级方法
     */
    private String productFallback() {
        System.out.println("请求失败：请求超时：");
        return "产品请求失败。。。稍后再试";
    }

    /**
     * 默认熔断降级方法
     */
    private String defaultFallback() {
        System.out.println("请求失败：");
        return "请求失败。。。稍后再试";
    }


    /**
     * 自动装配
     * 
     * @return
     */
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
