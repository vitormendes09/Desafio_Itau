package com.desafio.itau.springboot.dto;

import java.util.DoubleSummaryStatistics;

import com.desafio.itau.springboot.contracts.imodels.IStatisticsReponse;

public class StatisticsResponseDto implements IStatisticsReponse {

    private double sum;
    private double avg;
    private double max;
    private double min;
    private long count;

    public StatisticsResponseDto(DoubleSummaryStatistics statistics) {
        this.sum = statistics.getSum();
        this.avg = statistics.getAverage();
        this.max = statistics.getMax();
        this.min = statistics.getMin();
        this.count = statistics.getCount();

    }

    @Override
    public double getSum() {
        return this.sum;
    }

    @Override
    public double getAvg() {
       return this.avg;
    }

    @Override
    public double getMax() {
        return this.max;
    }

    @Override
    public double getMin() {
        return this.min;
    }

    @Override
    public long getCount() {
        return this.count;
    }
    
}
