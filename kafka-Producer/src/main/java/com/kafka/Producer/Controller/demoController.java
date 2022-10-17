package com.kafka.Producer.Controller;

import com.kafka.Producer.produce.kafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class demoController {

    @Autowired
    private kafkaProducer producer;
    @GetMapping("/publish")
    public String publishMessage(@RequestParam("msg") String msg){
        return producer.sendmessage(msg);
    }

    @PostMapping("/publish")
    public String publish(@RequestBody String obj){
        return producer.sendmessage(obj);
    }
}
