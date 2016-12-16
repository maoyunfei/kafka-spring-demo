package com.ws.myf.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

/**
 * Created by mao on 2016/11/25.
 */
public class MyKafkaReceiver2 {
    @KafkaListener(containerFactory = "kafkaListenerContainerFactory",topics = "topic-2")
    public void listen(@Payload String record){
        System.out.println("收到消息："+record);
    }
}
