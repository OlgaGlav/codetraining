package by.glavdel.tinkoff;

import java.util.Arrays;

public class ШахматныйМассив {
    public static void main(String[] args) {
//        int[][] array = new int[10][10];
//        for (int i = 0; i < array.length; i=i+2) {
//            for (int j=0;j<array[i].length;j=j+2){
//                array[i][j]=1;
//            }
//        }
//        for (int i = 1; i < array.length; i=i+2) {
//            for (int j=1;j<array[i].length;j=j+2){
//                array[i][j]=1;
//            }
//        }
//        System.out.println(Arrays.deepToString(array));

//        int[][] array = new int[10][10];
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                for (int j = 0; j < array[i].length; j = j + 2) {
//                    array[i][j] = 1;
//                }
//            }else{
//                for (int j = 1; j < array[i].length; j = j + 2) {
//                    array[i][j] = 1;
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(array));


        String[][] array = new String[10][10];
        for (int i = 0; i < array.length || i < 3; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "Black";
                } else {
                    array[i][j] = "White";
                }
            }

        }
        for (int i = 3; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = array[0];
            } else {
                array[i] = array[1];
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}

