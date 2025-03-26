package com.desafio.itau.springboot.contracts;

import java.time.OffsetDateTime;


public interface ITransaction {
    double getAmount();
    OffsetDateTime getDate();
}
