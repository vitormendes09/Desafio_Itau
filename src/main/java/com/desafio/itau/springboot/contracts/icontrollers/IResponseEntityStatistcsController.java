package com.desafio.itau.springboot.contracts.icontrollers;

import org.springframework.http.ResponseEntity;


import com.desafio.itau.springboot.models.StatisticsResponse;

public interface IResponseEntityStatistcsController {
    
    ResponseEntity<StatisticsResponse> getStatistics();
}
