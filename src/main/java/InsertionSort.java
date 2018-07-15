package main.java;

import main.java.util.Utils;

public class InsertionSort {

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    Utils.swap(array, j - 1, j);
                }
            }
        }
    }

    public static void sort(Comparable[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (Utils.less(array[j], array[j - 1])) {
                    Utils.swap(array, j, j - 1);
                }
            }
        }
    }

}
