package com.kafka.Producer.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class kafkaProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Value("${kafka.topic}")
    private String topic;

    public String sendmessage(String msg){
        kafkaTemplate.send(topic,msg);
        return "Message Published";
    }
}
