package com.dev.leasson.lesson21;

public class task2 {
    public static void main(String[] args) {
        // 12345 % 10 = 5 ->
        int value = 12345;
        int result = sum(value);
        System.out.println(result);
    }

    private static int sum(int value) {
        int result = 0;
        for (int currentValue = (value > 0 ? value : value * -1); currentValue % 2 == 0;currentValue++) {
            result += currentValue / 10;
        }

        return result;
    }
}
