package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test
    public void sumDay() {
        StatsService service = new StatsService();
        long[] days = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSumDays = 180;
        long actualSumDays = service.getSumSales(days);

        Assertions.assertEquals(expectedSumDays, actualSumDays);
    }
}


