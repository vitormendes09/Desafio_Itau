package com.desafio.itau.springboot.contracts.iusecase;

import com.desafio.itau.springboot.contracts.imodels.ITransaction;

public interface IAddTransactionUseCase {
    void addTransaction(ITransaction transaction);
}



