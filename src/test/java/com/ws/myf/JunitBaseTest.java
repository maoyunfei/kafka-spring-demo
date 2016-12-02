package com.ws.myf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = KafkaDemoApplication.class)
public class JunitBaseTest {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Test
    public void test(){
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("topic-1","123456");
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onSuccess(SendResult<String, String> result) {
                //TODO
                System.out.println("success");
            }

            @Override
            public void onFailure(Throwable ex) {
                //TODO
                System.out.println("failed");
            }

        });

    }
}
