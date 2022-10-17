package com.kafka.Consumer.Consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
        @KafkaListener(topics = "${kafka.topic}")
        public void listen(Message<String> msg){
                System.out.println(msg.getPayload());
        }
}
