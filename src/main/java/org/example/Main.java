package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateString("2/8/1*"));
    }

    private static List<Integer> splitNumbers(String temp) {
        StringBuilder numberToConvert = new StringBuilder();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < temp.length(); i++) {
            if (Character.isDigit(temp.charAt(i))) {
                numberToConvert.append(temp.charAt(i));
            } else {
                if (!numberToConvert.isEmpty()) {
                    numbers.add(Integer.parseInt(numberToConvert.toString()));
                    numberToConvert.setLength(0);
                }
            }
        }

        return numbers;
    }

    public static int calculateString(String temp) {
        List<Integer> numbersToCalculate = splitNumbers(temp);
        var wrapper = new Object() {int result = 0;};

        switch (temp.charAt(temp.length() - 1)) {
            case '+' -> numbersToCalculate.forEach(number -> wrapper.result += number);
            case '-' -> numbersToCalculate.forEach(number -> wrapper.result -= number);
            case '*' -> {
                wrapper.result = 1;
                numbersToCalculate.forEach(number -> wrapper.result *= number);
            }
        }
        return wrapper.result;
    }
}