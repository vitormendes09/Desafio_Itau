package com.desafio.itau.springboot.usecases;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.desafio.itau.springboot.contracts.imodels.ITransaction;
import com.desafio.itau.springboot.contracts.iusecase.IClearTransactionsUsecase;

public class ClearTransactionsUsecase implements IClearTransactionsUsecase{

    private final Queue<ITransaction> transactions = new ConcurrentLinkedQueue<>();

    public void clearTransactions() {
       transactions.clear();
    }
    
}
