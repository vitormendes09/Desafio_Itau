package com.desafio.itau.springboot.contracts.icontrollers;

import org.springframework.http.ResponseEntity;

public interface IDeleteTransactionController {
    ResponseEntity<Void> deleteTransaction();
}
