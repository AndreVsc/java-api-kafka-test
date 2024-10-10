package com.github.andrevsc.tutorial_rest_kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class TutorialRestKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialRestKafkaApplication.class, args);
	}

}
