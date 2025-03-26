package com.desafio.itau.springboot.contracts.icontrollers;

import org.springframework.http.ResponseEntity;
import com.desafio.itau.springboot.dto.TransactionRequestDto;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

public interface ICreateTransactionController {
    ResponseEntity<Void> createTransaction(@Valid @RequestBody TransactionRequestDto request);
}
