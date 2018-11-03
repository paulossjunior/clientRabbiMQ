package br.es.gov.prodest.espm.realtime.ClientRabbitMQ;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Consumer {
	
	@RabbitListener(queues = {"${spring.rabbitmq.queue.transcol.name}"})
    public void receive(@Payload String msg) {
        log.info("###### msg ######: " + msg);
    }

}
