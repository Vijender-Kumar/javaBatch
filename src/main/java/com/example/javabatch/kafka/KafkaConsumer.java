package com.example.javabatch.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "javaGuides")
    public void consume(String message){

    }
}
