package by.glavdel.tinkoff;

//Один из ваших знакомых стал стажером-аналитиком в команде Тинькофф.
//        У него есть данные за n дней о том, как клиенты подключают и отменяют подписки на один из сервисов.
////        По странному стечению обстоятельств дни чередуются:
//        в первый день подписки только подключались,
//        во второй только отменялись и т.д.,
//        т.е. каждый день число приобретенных подписок составляет(-1)^{i-1}a_i,
//        где a_i — число подключенных или отключенных подписок за i-й день.
////        Во время анализа данных ваш знакомый задался вопросом,
//        увеличилась бы прибыль компании, если бы данные за какие-то дни поменялись местами.
//        В качестве первого этапа он решил поменять местами не более двух дней.
////        Проверьте, сможете ли вы стать стажером-аналитиком в Тинькофф.
//        Для этого предлагаем вам посчитать максимально возможное значение прибыли,
//        которую можно получить, поменяв местами данные за не более, чем два дня.
//        Стоимость одной подписки можно считать равной 1.
//
//        Формат входных данных
//        В первой строке задано одно натуральное число n(2 <= n <= 10^5) — число дней, данные за которые у вас есть.
//        Во второй строке заданы n чисел a_i — количество подключенных/отмененных подписок за i-й день (1 <= i <= n, 1 <= a_i <= 10^3).
//
//        Формат выходных данных
//        В единственной строке выведите максимальную прибыль, которую можно получить, поменяв данные за не более, чем два дня.
//
//        Замечание
//        Можно менять данные за не более, чем два дня, в том числе не менять ничего.


import java.util.Scanner;

public class Class3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantityData = scanner.nextInt();
        int[] numberSubscriptions = new int[quantityData];

        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < numberSubscriptions.length; i++) {
            numberSubscriptions[i] = scanner.nextInt();
            if (i % 2 == 0) {
                if (numberSubscriptions[i] < numberSubscriptions[minIndex]) {
                    minIndex = i;
                }
            } else {
                if (numberSubscriptions[i] > numberSubscriptions[maxIndex]) {
                    maxIndex = i;
                }
            }
        }

        if (numberSubscriptions[maxIndex] > numberSubscriptions[minIndex]) {
            int temp = numberSubscriptions[maxIndex];
            numberSubscriptions[maxIndex] = numberSubscriptions[minIndex];
            numberSubscriptions[minIndex] = temp;
        }

        int profit = 0;
        for (int i = 0; i < numberSubscriptions.length; i++) {
            if (i % 2 == 0) {//+
                profit = profit + numberSubscriptions[i];
            } else {//-
                profit = profit - numberSubscriptions[i];
            }
        }
        System.out.println(profit);
    }
}

