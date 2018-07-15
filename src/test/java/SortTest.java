package test.java;

import main.java.InsertionSort;
import main.java.MergeSort;
import main.java.QuickSort;
import main.java.SelectionSort;
import main.java.util.SortObj;
import main.java.util.Utils;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static main.java.util.Utils.printArray;
import static org.junit.Assert.*;

public class SortTest {


    public static int ARRAY_LENGTH = 10;
    private static int[] array = new int[ARRAY_LENGTH];
    private static int[] arraySorted = new int[ARRAY_LENGTH];
    private static SortObj[] arrayObj = new SortObj[ARRAY_LENGTH];
    private static SortObj[] arrayObjSorted = new SortObj[ARRAY_LENGTH];
    private static Random generator = new Random();

    @BeforeClass
    public static void initArray() {
        for (int i=0; i< ARRAY_LENGTH; i++) {
            array[i] = generator.nextInt(40);
        }
        arraySorted = array.clone();
        Arrays.sort(arraySorted);

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arrayObj[i] = new SortObj(generator.nextInt(100), String.valueOf((char) (generator.nextInt(10) + 70)));
        }
        arrayObjSorted = arrayObj.clone();
        Arrays.sort(arrayObjSorted);

    }

    @Test
    public void testInsertionSortInt() {
        printArray(array);

        int[] arrayMine = array.clone();
        InsertionSort.sort(arrayMine);

        printArray(arraySorted);
        printArray(arrayMine);

        assertArrayEquals(arraySorted, arrayMine);
    }

    @Test
    public void testInsertionSortObj() {
        printArray(arrayObj);

        SortObj[] arrayMine = arrayObj.clone();
        InsertionSort.sort(arrayMine);

        printArray(arrayObjSorted);
        printArray(arrayMine);

        assertArrayEquals(arrayObjSorted, arrayMine);
    }

    @Test
    @Ignore
    public void testSelectionSortInt() {
        printArray(array);

        int[] arrayMine = array.clone();
        SelectionSort.sort(arrayMine);

        printArray(arraySorted);
        printArray(arrayMine);

        assertArrayEquals(arraySorted, arrayMine);
    }


    @Test
    @Ignore
    public void testSelectionSortObj() {
        printArray(arrayObj);

        SortObj[] arrayMine = arrayObj.clone();
        SelectionSort.sort(arrayMine);

        printArray(arrayObjSorted);
        printArray(arrayMine);

        assertArrayEquals(arrayObjSorted, arrayMine);
    }

    @Test
    @Ignore
    public void testQuickSortInt() {
        printArray(array);

        int[] arrayMine = array.clone();
        QuickSort.sort(arrayMine);

        printArray(arraySorted);
        printArray(arrayMine);

        assertArrayEquals(arraySorted, arrayMine);
    }

    @Test
    @Ignore
    public void testQuickSortObj() {
        printArray(arrayObj);

        SortObj[] arrayMine = arrayObj.clone();
        QuickSort.sort(arrayMine);

        printArray(arrayObjSorted);
        printArray(arrayMine);

        assertArrayEquals(arrayObjSorted, arrayMine);
    }


    @Test
    @Ignore
    public void testMergeSortInt() {
        printArray(array);

        int[] arrayMine = array.clone();
        arrayMine = MergeSort.sortFirst(arrayMine);

        Utils.printArray(arraySorted);
        Utils.printArray(arrayMine);

        assertArrayEquals(arraySorted, arrayMine);
    }

    @Test
    @Ignore
    public void testMergeSortObj() {
        printArray(arrayObj);

        SortObj[] arrayMine = arrayObj.clone();
        MergeSort.sortSecond(arrayMine);

        printArray(arrayObjSorted);
        printArray(arrayMine);

        assertArrayEquals(arrayObjSorted, arrayMine);
    }

}