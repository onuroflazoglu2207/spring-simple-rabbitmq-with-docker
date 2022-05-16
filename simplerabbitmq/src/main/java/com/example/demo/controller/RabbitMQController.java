package com.example.demo.controller;

import com.example.demo.model.RabbitMQModel;
import com.example.demo.service.RabbitMQService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rabbitmq")
@RequiredArgsConstructor
public class RabbitMQController {
    private final RabbitMQService service;

    @GetMapping("/send")
    public ResponseEntity<?> send(@RequestBody RabbitMQModel model) {
        return service.send(model);
    }
}
