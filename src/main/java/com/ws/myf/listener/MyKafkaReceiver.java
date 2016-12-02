package com.ws.myf.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * Created by mao on 2016/11/25.
 */
@Configuration
public class MyKafkaReceiver {
    @KafkaListener(group = "group-A",containerFactory = "kafkaListenerContainerFactory",topics = "topic-1")
    public void listen(ConsumerRecord<String, String> record){

        System.out.println("收到消息：");
    }
}
