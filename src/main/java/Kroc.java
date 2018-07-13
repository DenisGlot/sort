package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Kroc {

    public static void main(String[] args) {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

            String stringAmount = bufferRead.readLine();
            int amount = parsePositiveNumber(stringAmount);

            String stringNumbers = bufferRead.readLine();
            String[] splitNumbers = stringNumbers.split(" ");

            if (splitNumbers.length != amount) {
                System.out.println("Make sure the amount of numbers doesn't conflict with your first number!");
                return;
            }

            int[] numbers = new int[amount];
            for (int i = 0; i < amount; i++) {
                numbers[i] = parsePositiveNumber(splitNumbers[i]);
            }

            int sum = Arrays.stream(numbers).sum();

            System.out.println(sum);
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public static int parsePositiveNumber(String stringNumber) {
        try {
            int number = Integer.parseInt(stringNumber);
            checkPositive(number);
            return number;
        } catch (NumberFormatException e) {
            System.out.println(stringNumber + " is not a number!");
            System.exit(0);
        }
        return -1;
    }

    public static void checkPositive(int number) {
        if (number <= 0) {
            System.out.println(number + " must be greater than zero!");
            System.exit(0);
        }
    }

}
