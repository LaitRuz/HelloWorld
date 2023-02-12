package com.dev.leasson.lesson21;

public class task1 {
    public static void main(String[] args) {
        // 5! = 1 * 2 * 3 * 4 * 5 = 120
        int value = 5;
        int result =factorial(value);
        System.out.println(result); // 120
    }

    public static int factorial(int value) {
        int result = 1;
        for (int currentValue = 1; currentValue <= value; currentValue++) {
            result *= currentValue;
        }
        return result;
    }
}
