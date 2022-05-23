import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {

        /*
    [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18] - данные продаж по месяцам
    1 Сумму всех продаж
    2 Среднюю сумму продаж в месяц
    3 Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    4 Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    5 Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    6 Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
        */

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long one = service.sum(sales);
        System.out.println(one);

        long two = service.averageSum(sales);
        System.out.println(two);

        long three = service.lastMaxSale(sales);
        System.out.println(three);

        long four = service.lastMinSale(sales);
        System.out.println(four);

        long five = service.belowAverage(sales);
        System.out.println(five);

        long six = service.aboveAverage(sales);
        System.out.println(six);


    }
}
