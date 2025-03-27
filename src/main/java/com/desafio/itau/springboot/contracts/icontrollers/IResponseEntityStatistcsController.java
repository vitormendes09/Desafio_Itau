package com.desafio.itau.springboot.contracts.icontrollers;

import org.springframework.http.ResponseEntity;

import com.desafio.itau.springboot.contracts.imodels.IStatisticsReponse;

public interface IResponseEntityStatistcsController {
    
    ResponseEntity<IStatisticsReponse> getStatistics();
}
