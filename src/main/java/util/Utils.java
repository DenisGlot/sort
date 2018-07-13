package main.java.util;

public class Utils {

    public static void printArray(int[] array) {
        for (int i=0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }

    public static void printArray(Object[] array) {
        for (int i=0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }


    @SuppressWarnings("unchecked")
    public static boolean less(Comparable first, Comparable second) {
        return first.compareTo(second) < 0;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void swap(Object[] array, int i, int j) {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
