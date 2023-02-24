package com.dev.leasson.lesson26;

/**
 * Написать 2 метода, которые определяют индекс минимального и максимального значения
 * одномерного массива соответственно.
 */
public class lesson26RunnerTask4 {
    public static void main(String[] args) {
        int[] values = {1, 7, 0, 28, -24, 109, 5};
        System.out.println(getMinIndex(values)); //4
        System.out.println(getMaxIndex(values)); //5
    }

    public static int getMaxIndex(int[] values) {
        int maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[maxIndex] < values[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int getMinIndex(int[] values) {
        int minIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[minIndex] > values[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
