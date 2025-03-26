package com.desafio.itau.springboot.dto;

import java.time.OffsetDateTime;

import com.desafio.itau.springboot.contracts.imodels.ITransaction;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class TransactionRequestDto implements ITransaction{
    
    @NotNull
    @Min(0)
    private double amount;

    @NotNull
    private OffsetDateTime date;

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public OffsetDateTime getDate() {
        return date;
    }


}
