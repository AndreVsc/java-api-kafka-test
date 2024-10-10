package com.github.andrevsc.tutorial_rest_kafka.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestData {

    private String codigo;
    private String nomeProduto;
    private BigDecimal valor;

}