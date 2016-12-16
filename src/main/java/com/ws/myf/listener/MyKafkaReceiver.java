package com.ws.myf.listener;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

/**
 * Created by mao on 2016/11/25.
 */
@Configuration
@KafkaListener(containerFactory = "kafkaListenerContainerFactory",topics = "topic-1")
public class MyKafkaReceiver {
    @KafkaHandler
    public void listen(@Payload String record){
        System.out.println("收到消息：");
    }
}
