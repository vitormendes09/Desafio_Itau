package com.desafio.itau.springboot.controllers;

import java.util.DoubleSummaryStatistics;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import com.desafio.itau.springboot.contracts.icontrollers.IResponseEntityStatistcsController;

import com.desafio.itau.springboot.contracts.iusecase.IGetStatisticsUseCase;
import com.desafio.itau.springboot.models.StatisticsResponse;


@RequestMapping("/estatistica")
public class ResponseEntityStatistcsController implements IResponseEntityStatistcsController {

    private final IGetStatisticsUseCase getStatisticsUseCase;

    public ResponseEntityStatistcsController(IGetStatisticsUseCase getStatisticsUseCase) {
        this.getStatisticsUseCase = getStatisticsUseCase;
    }


    
    public ResponseEntity<StatisticsResponse> getStatistics() {
       
        DoubleSummaryStatistics statistics = getStatisticsUseCase.getStatistics();
        return ResponseEntity.ok()
                .body(new StatisticsResponse(
                        statistics.getSum(),
                        statistics.getAverage(),
                        statistics.getMin(),
                        statistics.getMax(),
                        statistics.getCount()));
    }
    
   

    
}
