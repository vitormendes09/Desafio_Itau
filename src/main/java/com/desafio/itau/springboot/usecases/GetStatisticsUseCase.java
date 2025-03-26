package com.desafio.itau.springboot.usecases;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Service;

import com.desafio.itau.springboot.contracts.imodels.ITransaction;
import com.desafio.itau.springboot.contracts.iusecase.IGetStatisticsUseCase;


@Service
public class GetStatisticsUseCase implements IGetStatisticsUseCase {

        private final Queue<ITransaction> transactions = new ConcurrentLinkedQueue<>();

   
    public DoubleSummaryStatistics getStatistics() {
        OffsetDateTime now = OffsetDateTime.now();

        return transactions.stream()
            .filter(t -> t.getDate().isAfter(now.minusSeconds(60)))
            .mapToDouble(ITransaction::getAmount)
            .summaryStatistics();
    }
    
}
