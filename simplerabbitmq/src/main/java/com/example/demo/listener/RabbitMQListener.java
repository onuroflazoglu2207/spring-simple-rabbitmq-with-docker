package com.example.demo.listener;

import com.example.demo.model.RabbitMQModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RabbitMQListener {

    @RabbitListener(queues = "rabbit.queue")
    private void listen(RabbitMQModel model) {
        log.info(model.toString());
    }
}
