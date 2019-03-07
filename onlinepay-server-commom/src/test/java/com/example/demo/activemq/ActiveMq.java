package com.example.demo.activemq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.store.BookstoreApplication;
import com.example.store.config.activemq.Producer;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookstoreApplication.class)
public class ActiveMq {

    @Autowired
    Producer produce;

    @Test
    public void context() {
        for (int i = 0; i < 100; i++) {
            produce.sentMessage("result.tocip", "message:" + i + "个");
        }
    }
}
