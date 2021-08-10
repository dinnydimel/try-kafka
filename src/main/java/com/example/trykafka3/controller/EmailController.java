package com.example.trykafka3.controller;


import com.example.trykafka3.model.EmailMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmailController {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    @Autowired
    ObjectMapper objectMapper;

    @PostMapping("/email")
    public void sendEmail(@RequestBody EmailMessage message) throws JsonProcessingException{
        String emailMessage = objectMapper.writeValueAsString(message);
        kafkaTemplate.send("enigma-email-notification", emailMessage);
        System.out.println("Email has been sent");

    }
}
