package com.desafio.itau.springboot.contracts;

public interface IStatisticsReponse {

    
    double getSum();
    double getAvg();
    double getMax();
    double getMin();
    long getCount();
}
