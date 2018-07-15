package main.java;

import main.java.util.Utils;

public class ShellSort {

    public static void sort(int[] array) {
        int h = 1;
        while (h < array.length / 3) h = 3 * h + 1;

        while (h > 0) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (array[j] < array[j - h]) {
                        Utils.swap(array, j, j - h);
                    }
                }
            }
            h /= 3;
        }
    }

    public static void sort(Comparable[] array) {
        int h = 1;
        while (h < array.length / 3) h = 3 * h + 1;

        while (h > 0) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (Utils.less(array[j], array[j - h])) {
                        Utils.swap(array, j, j - h);
                    }
                }
            }
            h /= 3;
        }
    }
}
