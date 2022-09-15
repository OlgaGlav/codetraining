package by.glavdel.tinkoff;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMap {

    public static void main(String[] args) {
        Map<String, Integer> nonSortMap = Map.of("One", 1,
                "Three", 3,
                "Five", 5,
                "Two", 2,
                "Four", 4);

        Map<String, Integer> sortedMap = sortByValue(nonSortMap);
        sortedMap.entrySet().forEach(System.out::println);
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> nonSortMap) {
        List<Integer> sortValues = nonSortMap.values().stream().sorted().toList();
        sortValues.forEach(System.out::println);
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Integer value : sortValues) {
            sortedMap.put(nonSortMap.keySet().stream().filter(key -> nonSortMap.get(key).equals(value)).findFirst().get(), value);
        }
        return sortedMap;
    }
}

