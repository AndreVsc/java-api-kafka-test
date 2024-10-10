package com.github.andrevsc.tutorial_rest_kafka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterEventService {

    private final KafkaTemplate<Object, Object> template;

    public <T> void addEvent(String topico, T dados) {
        template.send(topico, dados);
    }

}