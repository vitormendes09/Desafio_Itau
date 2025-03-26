package com.desafio.itau.springboot.usecases;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Service;

import com.desafio.itau.springboot.contracts.imodels.ITransaction;
import com.desafio.itau.springboot.contracts.iusecase.IAddTransactionUseCase;

@Service
public class AddTransactionService implements IAddTransactionUseCase {

    private final Queue<ITransaction> transactions = new ConcurrentLinkedQueue<>();

    public void addTransaction(ITransaction transaction) {
       transactions.add(transaction);
    }
}