package com.example.store.config.activemq;

import javax.jms.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.stereotype.Service;

/**
 * 消费者服务
 * 
 * @author ONEC
 *
 */
@Service
public class Consmumer {


    @JmsListener(destination = "result.queue")
    public void receiveMessage(String message) {
        System.out.println("接收到消费消息queue：" + message);
    }

    @JmsListener(destination = "result.tocip", containerFactory = "myJmsListenerContainerFactory")
    public void receiveTocip(String message) {
        System.out.println("接收到消费消息tocip：" + message);
    }

    @Bean
    JmsListenerContainerFactory<?> myJmsListenerContainerFactory(
            ConnectionFactory connectionFactory) {
        SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setPubSubDomain(true);
        return factory;
    }
}
