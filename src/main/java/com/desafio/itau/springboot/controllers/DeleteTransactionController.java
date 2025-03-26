package com.desafio.itau.springboot.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.itau.springboot.contracts.icontrollers.IDeleteTransactionController;
import com.desafio.itau.springboot.contracts.iusecase.IClearTransactionsUsecase;

@RestController
@RequestMapping("/transacao")
public class DeleteTransactionController implements IDeleteTransactionController {

    private final IClearTransactionsUsecase iClearTransactionsUsecase;

    public DeleteTransactionController(IClearTransactionsUsecase iClearTransactionsUsecase){
        this.iClearTransactionsUsecase = iClearTransactionsUsecase;
    }


    @DeleteMapping
    public ResponseEntity<Void> deleteTransaction() {
       iClearTransactionsUsecase.clearTransactions();
         return ResponseEntity.ok().build();
    }
    
}
