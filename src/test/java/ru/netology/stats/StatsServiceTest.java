package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.getSumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMiddleSales() {
        StatsService service = new StatsService();
        long[] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.getMiddleSales(days);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxMonSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minMonSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getAmountMonthMinMidSal() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.getAmountMonthMinMidSal(sales);

        Assertions.assertEquals(expected, actual);
    }
}



