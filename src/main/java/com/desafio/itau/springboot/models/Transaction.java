package com.desafio.itau.springboot.models;

import java.time.OffsetDateTime;

import com.desafio.itau.springboot.contracts.ITransaction;

public class Transaction implements ITransaction {
        private double amount;
        private OffsetDateTime date;
    
    
        public void transaction(final double amount, final  OffsetDateTime date) {
            this.amount = amount;
            this.date = date;
        }
    
        public double getAmount() {
            return amount;
        }
    
        public OffsetDateTime getDate() {
            return date;
        }
    
}
