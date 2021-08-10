package com.example.trykafka3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class Trykafka3Application {

    public static void main(String[] args) {
        SpringApplication.run(Trykafka3Application.class, args);
    }

    @KafkaListener(id="kafka", topics = "enigma-email-notification")
    public void listener(String foo){
        System.out.println(foo);
    }

}
