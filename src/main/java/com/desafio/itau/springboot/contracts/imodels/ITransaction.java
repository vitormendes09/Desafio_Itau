package com.desafio.itau.springboot.contracts.imodels;

import java.time.OffsetDateTime;


public interface ITransaction {
    
    double getAmount();
    OffsetDateTime getDate();
}
