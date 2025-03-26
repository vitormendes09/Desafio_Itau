package com.desafio.itau.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.itau.springboot.contracts.icontrollers.ICreateTransactionController;
import com.desafio.itau.springboot.contracts.iusecase.IAddTransactionUseCase;
import com.desafio.itau.springboot.dto.TransactionRequestDto;


import jakarta.validation.Valid;

import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/transacao")
public class ICreateTransaction implements ICreateTransactionController {
    
    private final IAddTransactionUseCase iAddTransactionUseCase;

    public ICreateTransaction(IAddTransactionUseCase iAddTransactionUseCase){
        this.iAddTransactionUseCase = iAddTransactionUseCase;
    }

    @PostMapping()
    public ResponseEntity<Void> createTransaction(@Valid @RequestBody  TransactionRequestDto request) {
        if (request.getDate().isAfter(OffsetDateTime.now())){

            return ResponseEntity.unprocessableEntity().build();

        }

        iAddTransactionUseCase.addTransaction(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
}

