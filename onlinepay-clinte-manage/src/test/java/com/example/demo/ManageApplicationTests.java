package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import com.example.store.model.request.RequestParam;
import com.example.store.service.login.UserLoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.store.ManageApplication;
import com.example.store.service.agent.IAgentLoginService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ManageApplication.class) // 选择单元测试的启动类
public class ManageApplicationTests {
    @Autowired
    private UserLoginService loginService;

    @Test
    public void contextLoads() {
        System.out.println("开始单元测试：");
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("username", "15611321516");
        requestMap.put("password", "ONEC2112");
        // loginService.addAgentParam(requestMap);

        RequestParam requestParam = new RequestParam();
        requestParam.setUserName("小样ONEC");
        requestParam.setUserEmail("2650020302@qq.com");
        requestParam.setUserPhone("15611321516");
        requestParam.setUserPassword("ONEC@2112");

        loginService.addSaleInfo(requestParam);
    }

}
