package main.java;

import main.java.util.SortObj;

import java.util.Arrays;

public class MergeSort {

    public static void sortSecond(SortObj[] array) {
        sortSecond(array, 0, array.length - 1);
    }

    private static void sortSecond(SortObj[] array, int start, int end) {
        if (end <= start) return;

        int mid = (end + start) / 2;

        sortSecond(array, start, mid);
        sortSecond(array, mid + 1, end);

        SortObj[] buf = array.clone();

        int i = start, j = mid + 1;
        for (int k = start; k <= end; k++) {
            if (i > mid) {
                array[k] = buf[j];
                j++;
            } else if (j > end) {
                array[k] = buf[i];
                i++;
            } else if (buf[i].compareTo(buf[j]) > 0) {
                array[k] = buf[j];
                j++;
            } else {
                array[k] = buf[i];
                i++;
            }
        }
    }

    public static int[] sortFirst(int[] a) {
        if(a.length < 2) return a;
        int m = a.length / 2;
        int[] arr1 = Arrays.copyOfRange(a, 0, m);
        int[] arr2 = Arrays.copyOfRange(a, m, a.length);
        return merge(sortFirst(arr1), sortFirst(arr2));
    }

    private static int[] merge(int[] a1, int[] a2) {
        int commonSize = a1.length + a2.length;

        int[] a12 = new int[commonSize];

        int i = 0, j = 0;

        for (int k = 0; k < commonSize; k++) {
            if (i >= a1.length) {
                a12[k] = a2[j];
                j++;
            } else if (j >= a2.length) {
                a12[k] = a1[i];
                i++;
            } else if (a1[i] < a2[j]) {
                a12[k] = a1[i];
                i++;
            } else {
                a12[k] = a2[j];
                j++;
            }
        }
        return a12;
    }

}
