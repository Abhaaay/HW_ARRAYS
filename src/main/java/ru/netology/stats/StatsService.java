package ru.netology.stats;

public class StatsService {
    public long getSumSales(long[] sales) {
        long sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }

        return sumSales;
    }

    public long getMiddleSales(long[] sales) {
        long sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        long middleSales = sumSales / sales.length;


        return middleSales;
    }

    public int maxMonSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minMonSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getAmountMonthMinMidSal(long[] sales) {
        int counter = 0;
        long middleSales = getMiddleSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middleSales) {
                counter++;
            }
        }

        return counter;

    }

    public int getAmountMonthMaxMidSal(long[] sales) {
        int counter = 0;
        long middleSales = getMiddleSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middleSales) {
                counter++;
            }
        }

        return counter;
    }
}




