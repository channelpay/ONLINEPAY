package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.store.CommonServiceApplication;
import com.example.store.service.agent.IAgentLoginService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CommonServiceApplication.class) // 选择单元测试的启动类
public class BookstoreApplicationTests {
    @Autowired
    private IAgentLoginService loginService;

    @Test
    public void contextLoads() {
        System.out.println("开始单元测试：");
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("username", "15611321516");
        requestMap.put("password", "ONEC2112");
        // loginService.addAgentParam(requestMap);
    }

}
