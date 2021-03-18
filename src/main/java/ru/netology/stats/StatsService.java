package ru.netology.stats;

public class StatsService {

    public long totalOfAllSales(long[] salesByMonths) {
        long sum = 0;
        for (long sale : salesByMonths) {
            sum += sale;
        }
        return sum;
    }

    public long averageSalesAmountPerMonth(long[] salesByMonths) {
        long averageSalesAmountPerMonth = totalOfAllSales(salesByMonths) / salesByMonths.length;
        return averageSalesAmountPerMonth;
    }

    public long numberOfMonthSalesMax(long[] salesByMonths) {
            long currentMax = salesByMonths[0];
            long numberOfMonthMaxSales = 0;
            for (int i = 0; i < salesByMonths.length; i++) {
                if (salesByMonths [i] >= currentMax) {
                    currentMax = salesByMonths[i];
                    numberOfMonthMaxSales = i + 1;
                }
            }
            return numberOfMonthMaxSales;
        }

    public long numberOfMonthSalesMin(long[] salesByMonths) {
        long currentMin = salesByMonths[0];
        long numberOfMonthMinSales = 0;
        for (int i = 0; i < salesByMonths.length; i++) {
            if (salesByMonths [i] <= currentMin) {
                currentMin = salesByMonths[i];
                numberOfMonthMinSales = i + 1;
            }
        }
        return numberOfMonthMinSales;
    }

    public long monthsAmountWithSalesLowerAverage(long[] salesByMonths) {
        long monthsAmount = 0;
        long sum =0;
        for (long purchase : salesByMonths) {
            sum += purchase;
        }
        for (long purchase : salesByMonths) {
            if (purchase < averageSalesAmountPerMonth(salesByMonths)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;

    }
    public long monthsAmountWithSalesHigherAverage(long[] salesByMonths) {
        long monthsAmount = 0;
        long sum =0;
        for (long purchase : salesByMonths) {
            sum += purchase;
        }
        for (long purchase : salesByMonths) {
            if (purchase > averageSalesAmountPerMonth(salesByMonths)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }
}
