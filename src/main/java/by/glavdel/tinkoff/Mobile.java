package by.glavdel.tinkoff;

// Костя подключен к мобильному оператору «Мобайл».
// Абонентская плата Кости составляет A рублей в месяц.
// За эту стоимость Костя получает B мегабайт интернет-трафика.
// Если Костя выйдет за лимит трафика, то каждый следующий мегабайт будет стоить ему  C  рублей.
// Костя планирует потратить D мегабайт интернет-трафика в следующий месяц.
// Помогите ему сосчитать, во сколько рублей ему обойдется интернет.
//
//        Формат входных данных
//        Вводится 4 целых положительных числа A,B,C,D(1≤A,B,C,D≤100) —
//        стоимость тарифа Кости, размер тарифа Кости, стоимость каждого лишнего мегабайта, размер интернет-трафика Кости в следующем месяце.
//        Числа во входном файле разделены пробелами.
//
//        Формат выходных данных
//        Выведите одно натуральное число — суммарные расходы Кости на интернет.
//
//        Замечание
//        В первом примере Костя сначала оплатит пакет интернета, после чего потратит на 5 мегабайт больше, чем разрешено по тарифу.
//        Следовательно, за 5 мегабайт он дополняет отдельно, получившаяся стоимость 100+12×5=160 рублей.
//
//        Во втором примере Костя укладывается в тарифный план, поэтому платит только за него.
//
//
//ВВод 100  10  12  15,   вывод 160
//ВВод 100  10  12  1,    вывод 100

import java.math.BigDecimal;
import java.util.Scanner;

public class Mobile {

    public static final int QUANTITY_USER_INPUT = 4;
    public static BigDecimal abonentSum;
    public static int trafficMb;
    public static BigDecimal costMbAfterLimit;
    public static int plannedMb;

    public static String[] inputData = new String[4];


    public static void main(String[] args) {
        System.out.println("Input data: ");
        readInputData();
        System.out.println(countTotalCost());
    }

    private static BigDecimal countTotalCost() {
        BigDecimal totalCost = abonentSum;
        if (plannedMb <= trafficMb) {
            return totalCost;
        }
        return totalCost.add(costMbAfterLimit.multiply(BigDecimal.valueOf(plannedMb - trafficMb)));
    }

    private static void readInputData() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < QUANTITY_USER_INPUT; i++) {
            inputData[i] = scanner.next();
        }
        abonentSum = BigDecimal.valueOf(Double.parseDouble(inputData[0]));
        trafficMb = Integer.parseInt(inputData[1]);
        costMbAfterLimit = BigDecimal.valueOf(Double.parseDouble(inputData[2]));
        plannedMb = Integer.parseInt(inputData[3]);
    }
}

