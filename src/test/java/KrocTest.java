package test.java;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class KrocTest {

    @Test
    public void main() {
        String data = "5\r\n";
        String data2 = "13 23 34 12 15\r\n";
        InputStream stdin = System.in;

        long startTime = System.currentTimeMillis();

        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

            System.setIn(new ByteArrayInputStream(data.getBytes()));
            String stringAmount = bufferRead.readLine();
            int amount = parseNumber(stringAmount);
            System.setIn(stdin);

            int[] numbers = new int[amount];

            System.setIn(new ByteArrayInputStream(data2.getBytes()));
            String stringNumbers = bufferRead.readLine();
            System.setIn(stdin);
            String[] splitNumbers = stringNumbers.split(" ");

            if (splitNumbers.length != amount) {
                System.out.println("Make sure the amount of numbers doesn't conflict with your first number!");
                return;
            }

            for (int i = 0; i < amount; i++) {
                numbers[i] = parseNumber(splitNumbers[i]);
            }

            int sum = Arrays.stream(numbers).sum();

            System.out.println(sum);
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        System.out.println(System.currentTimeMillis() - startTime);

    }

    public static int parseNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println(number + " is not a number!");
            System.exit(0);
        }
        return -1;
    }

}
