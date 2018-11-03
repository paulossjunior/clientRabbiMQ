package br.es.gov.prodest.espm.realtime.ClientRabbitMQ;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class ClientRabbitMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientRabbitMqApplication.class, args);
	}
}
