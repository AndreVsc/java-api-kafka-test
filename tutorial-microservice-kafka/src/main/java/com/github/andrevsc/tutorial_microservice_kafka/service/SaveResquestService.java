package com.github.andrevsc.tutorial_microservice_kafka.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.andrevsc.tutorial_microservice_kafka.data.RequestData;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SaveResquestService {

    @KafkaListener(topics = "SaveRequest", groupId = "MicroserviceSaveRequest")
    private void executar(ConsumerRecord<String, String> record) {

        log.info("Key = {}", record.key());
        log.info("Header = {}", record.headers());
        log.info("Part = {}", record.partition());

        String strDados = record.value();

        ObjectMapper mapper = new ObjectMapper();
        RequestData pedido;

        try {
            pedido = mapper.readValue(strDados, RequestData.class);
        } catch (JsonProcessingException ex) {
            log.error("Error Event convert [dado={}}]", strDados, ex);
            return;
        }

        log.info("EnventResponse  = {}", pedido);

        gravar(pedido);

    }

    private void gravar(RequestData pedido) {
        System.out.println("Gravando pedido: " + pedido);
    }



}