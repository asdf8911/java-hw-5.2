package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) { // 1
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSum(long[] sales) { // 2
        return sum(sales) / sales.length;
    }

    public int lastMaxSale(long[] sales) { // 3
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public long lastMinSale(long[] sales) { // 4
        long min = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < min) {
                min = i;
            }
        }
        return min + 1;
    }

    public int belowAverage(long[] sales) { // 5
        long average = averageSum(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverage(long[] sales) {  // 6
        long average = averageSum(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }

}

