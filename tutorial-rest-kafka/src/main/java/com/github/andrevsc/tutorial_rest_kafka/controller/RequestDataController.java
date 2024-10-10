package com.github.andrevsc.tutorial_rest_kafka.controller;

import com.github.andrevsc.tutorial_rest_kafka.data.RequestData;
import com.github.andrevsc.tutorial_rest_kafka.service.RegisterEventService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RequestDataController {

    private final RegisterEventService eventoService;

    @PostMapping(path = "/api/save-request")
    public ResponseEntity<String>  SalvarPedido(@RequestBody RequestData pedido) {
        eventoService.addEvent("SaveRequest", pedido);
        return ResponseEntity.ok("Sucess");
    }

}