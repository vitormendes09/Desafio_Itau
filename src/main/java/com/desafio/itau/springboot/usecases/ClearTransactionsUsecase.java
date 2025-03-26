package com.desafio.itau.springboot.usecases;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Service;

import com.desafio.itau.springboot.contracts.imodels.ITransaction;
import com.desafio.itau.springboot.contracts.iusecase.IClearTransactionsUsecase;

@Service
public class ClearTransactionsUsecase implements IClearTransactionsUsecase{

    private final Queue<ITransaction> transactions = new ConcurrentLinkedQueue<>();

    public void clearTransactions() {
       transactions.clear();
    }
    
}
