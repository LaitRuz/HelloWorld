package com.dev.leasson.lesson26;

public class lesson26RunnerTask2 {
    public static void main(String[] args) {
        int[] values = new int[100];
        lesson26Runner.printArray(values);
        fillArray(values);
        lesson26Runner.printArray(values);
    }

    private static void fillArray(int[] values) {
        int currentIndex = 0;
        for (int currentValue = 0; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex] = currentValue;
                currentIndex++;
            }
        }
    }
}