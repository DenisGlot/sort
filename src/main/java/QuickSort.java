package main.java;

import main.java.util.SortObj;
import main.java.util.Utils;

public class QuickSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int start, int end) {
        int i = start, j = end;

        int pivot = array[(i + j) / 2];

        while (i <= j) {

            while (array[i] < pivot) i++;

            while (array[j] > pivot) j--;

            if (i <= j) {
                Utils.swap(array, i, j);
                i++;
                j--;
            }
        }

        if (start < j)
            sort(array, start, j);
        if (i < end)
            sort(array, i, end);
    }

    public static void sort(SortObj[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(SortObj[] array, int start, int end) {
        int i = start, j = end;

        SortObj pivot = array[(i + j) / 2];

        while (i <= j) {
            while (array[i].compareTo(pivot) < 0) i++;

            while (array[j].compareTo(pivot) > 0) j--;

            if (i <= j) {
                Utils.swap(array, i, j);
                i++;
                j--;
            }
        }

        if (start < j) {
            sort(array, start, j);
        }
        if (i < end) {
            sort(array, i, end);
        }
    }

}