package ru.netology.stats;

public class StatsService {
    public long getSumSales(long[] sales) {
        long sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }

        return sumSales;
    }
}





