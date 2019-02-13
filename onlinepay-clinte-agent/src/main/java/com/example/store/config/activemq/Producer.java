package com.example.store.config.activemq;

import javax.jms.Destination;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * 
 * activemq 消息生产者
 * 
 * 
 * @author ONEC
 *
 */
@Service
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * @param queuces 生产名称
     * @param message 生产消息
     */
    public void sentMessage(String destName, String message) {
        Destination destination = new ActiveMQQueue(destName);
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}
