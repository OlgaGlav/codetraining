package by.glavdel.tinkoff;

////Аня — координатор стажировок в Тинькофф. Она хочет нанять самых сильных олимпиадников.
////        Для того чтобы понять, кто же лучший,
//        Аня решила проанализировать результаты командной олимпиады за последние N лет.
////        Она знает все команды, занявшие первое место.
//        Каждая команда задается тройкой имен, причем их порядок не важен,
//        то есть записи ANTON BORIS CHRIS и BORIS ANTON CHRIS задают одну и ту же команду.
////        Ане нужны лучшие из лучших,
//        поэтому она хочет знать, какое максимальное число раз побеждала команда в одном и том же составе.
////        Вы дружите с Аней, поэтому согласились ей помочь.

//        Формат входных данных
//        В первой строке задано одно целое число N(1 <= N <= 10^3) — количество лет, за которые у Ани есть данные.
//        В следующих N строках заданы команды-победители: в каждой строке указаны три разделенных пробелом имени.
//        Каждое имя имеет длину от 1 до 10 символов,
//        а также состоит из заглавных латинских символов (A, ..., Z).
//
//        Формат выходных данных
//        В единственной строке выведите число — максимальное число побед команды в одинаковом составе.


import java.util.*;
import java.util.stream.Collectors;

public class Class2 {

    public static void main(String[] args) {

        Map<List<String>, Integer> statistics = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        int temp = 0;
        int max = 0;
        do {
            List<String> team = Arrays.stream(scanner.nextLine().split(" "))
                    .sorted()
                    .collect(Collectors.toList());
            if (!statistics.containsKey(team)) {
                statistics.put(team, 0);
            }
            int quantity = statistics.get(team) + 1;
            statistics.put(team, quantity);
            if (quantity > max) {
                max = quantity;
            }
            temp += 1;
        } while (temp <= years);

        System.out.println(max);
    }
}
