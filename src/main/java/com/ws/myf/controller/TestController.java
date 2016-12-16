package com.ws.myf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mao on 2016/11/30.
 */
@RestController
public class TestController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @RequestMapping(value = "/test",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getCaseEntrustChargeType(@RequestParam(name = "topic")String topic,
                                           @RequestParam(name = "text")String test) {
        kafkaTemplate.send(topic,test);
        return "hello";
    }
}
