package by.glavdel.tinkoff;

import java.util.Arrays;

public class SortReverseOrder {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 8, 97, 2, 77};
        Arrays.sort(array);

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}

