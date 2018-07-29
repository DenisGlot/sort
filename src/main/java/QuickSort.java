package main.java;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import main.java.util.SortObj;
import main.java.util.Utils;

import javax.rmi.CORBA.Util;

public class QuickSort {

    public static void sortFirst(int[] array) {
        sortFirst(array, 0, array.length - 1);
    }

    private static void sortFirst(int[] array, int start, int end) {
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
            sortFirst(array, start, j);
        if (i < end)
            sortFirst(array, i, end);
    }

    public static void sortFirst(SortObj[] array) {
        sortFirst(array, 0, array.length - 1);
    }

    private static void sortFirst(SortObj[] array, int start, int end) {
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
            sortFirst(array, start, j);
        }
        if (i < end) {
            sortFirst(array, i, end);
        }
    }

    public static void sortSecond(int[] a) {
        sortSecond(a, 0, a.length - 1);
    }

    private static void sortSecond(int[] a, int start, int end) {
        if (start >= end) return;
        int pivotIndex = partition(a, start, end);

        sortSecond(a, 0, pivotIndex - 1);
        sortSecond(a, pivotIndex + 1, end);
    }

    private static int partition(int[] a, int start, int end) {
        int i = start, j = end + 1;
        int pivot = a[start];

        while (true) {
            while (a[++i] < pivot) if (i == end) break;
            while (pivot < a[--j]) if (j == start) break;

            if (i >= j) break;

            Utils.swap(a, i, j);
        }

        Utils.swap(a, start, j);
        return j;
    }

    public static void sortSecond(Comparable[] a) {
        sortSecond(a, 0, a.length - 1);
    }

    private static void sortSecond(Comparable[] a, int start, int end) {
        if (start >= end) return;

        int pivotIndex = partition(a, start, end);

        sortSecond(a, 0, pivotIndex - 1);
        sortSecond(a, pivotIndex + 1, end);
    }

    private static int partition(Comparable[] a, int start, int end) {
        int i = start, j = end + 1;

        Comparable pivot = a[start];

        while (true) {

            while (Utils.less(a[++i], pivot)) if (i >= end) break;
            while (Utils.less(pivot, a[--j])) if (j <= start) break;

            if (i >= j) break;
            Utils.swap(a, i, j);
        }

        Utils.swap(a, start, j);
        return j;
    }


}