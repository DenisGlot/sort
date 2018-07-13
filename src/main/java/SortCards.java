package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCards {

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

            List<Integer> numbers = new ArrayList<>(amount);
            for (int i = 0; i < amount; i++) {
                int add = parsePositiveNumber(splitNumbers[i]);
                numbers.add(add);
            }

            int result = 0;

            for (int i = 0; i < amount; i++) {
                Integer min = Collections.min(numbers);
                int minIndex = numbers.indexOf(min);
                result += minIndex + 1;
                numbers.remove(min);

                if (minIndex != amount - 1) {
                    Collections.rotate(numbers, minIndex);
                }
            }

            System.out.println(result);

        } catch (IOException e) {
            System.out.println("Couldn't read numbers!");
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
        if (number < 0) {
            System.out.println(number + " must be positive!");
            System.exit(0);
        } else if (number > 100) {
            System.out.println(number + " must be less than 100!");
            System.exit(0);
        }
    }

}
