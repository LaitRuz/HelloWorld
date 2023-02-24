package com.dev.leasson.lesson26;
/**
 * Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */
public class lesson26RunnerTask5 {
    public static void main(String[] args) {
        int[] values = {1, 7, 0, 28, -24, 2, 8, -4, 109, 5, -30};
        System.out.println("Sum: " + sum(values)); // 0
        System.out.println("Sum: " + sum2(values)); // 0
    }

    public static int sum2(int[] values){
        int result = 0;
        int startIndex = lesson26RunnerTask4.getMinIndex(values);
        int endIndex = lesson26RunnerTask4.getMaxIndex(values);
        if (endIndex < startIndex) {
            int temp = endIndex;
            endIndex = startIndex;
            startIndex = temp;
        }
        for (int i = startIndex + 1; i < endIndex; i++) {
            result += values[i];
        }
        return result;
    }
    public static int sum(int[] values){
        int result = 0;
        int minIndex = lesson26RunnerTask4.getMinIndex(values);
        int maxIndex = lesson26RunnerTask4.getMaxIndex(values);
        //int startIndex = minIndex < maxIndex ? minIndex : maxIndex;
        int startIndex = Math.min(minIndex, maxIndex);
        int endIndex = Math.max(minIndex, maxIndex);
        for (int i = startIndex + 1; i < endIndex; i++) {
            result += values[i];
        }
        return result;
    }
}

