package com.example.demo.service;

import com.example.demo.config.RabbitMQConfig;
import com.example.demo.model.RabbitMQModel;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitMQService {

    private final AmqpTemplate rabbitTemplate;
    private final RabbitMQConfig config;

    public ResponseEntity<?> send(RabbitMQModel model) {
        try {
            rabbitTemplate.convertAndSend(config.getExchange(), config.getRoutingkey(), model);
            return ResponseEntity.ok(model);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad request!");
        }
    }
}
