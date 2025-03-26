package com.desafio.itau.springboot.contracts.imodels;

public interface IStatisticsReponse {


    double getSum();
    double getAvg();
    double getMax();
    double getMin();
    long getCount();
}
