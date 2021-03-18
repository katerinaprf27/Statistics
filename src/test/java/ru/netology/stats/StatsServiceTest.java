package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void totalOfAllSales() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.totalOfAllSales(salesByMonths);
        assertEquals(expected, actual);
    }

    @Test
    void averageSalesAmountPerMonth() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.averageSalesAmountPerMonth(salesByMonths);
        assertEquals(expected, actual);
    }

    @Test
    void numberOfMonthSalesMax() {
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.numberOfMonthSalesMax(salesByMonths);
        assertEquals(expected, actual);
    }

    @Test
    void numberOfMonthSalesMin() {
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.numberOfMonthSalesMin(salesByMonths);
        assertEquals(expected, actual);
    }

    @Test
    void monthsAmountWithSalesLowerAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.monthsAmountWithSalesLowerAverage(salesByMonths);
        assertEquals(expected, actual);
    }

    @Test
    void monthsAmountWithSalesHigherAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.monthsAmountWithSalesHigherAverage(salesByMonths);
        assertEquals(expected, actual);
    }
}

