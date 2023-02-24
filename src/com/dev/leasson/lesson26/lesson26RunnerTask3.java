package com.dev.leasson.lesson26;
/**
 * Написать метод equals, который определяет, равны ли между собой соответствующие элементы
 *    2-х двумерных массивов.
 */
public class lesson26RunnerTask3 {
    public static void main(String[] args) {
        int[][] value1 = {
                {1, 2, 3},
                {4,5,6,7},
                {7,8}
        };
        int[][] value2 = {
                {1,2,3},
                {4,5,6,7},
                {7,8}
        };
        System.out.println(equals(value1,value2));
    }
    public static boolean equals(int[][] value1, int[][] values2) {
        boolean result = true;
        if (value1.length != value1.length) {
            return false;
        }
        for (int i = 0; i < values2.length; i++) {
            int[] array1 = value1[i];
            int[] array2 = values2[i];
            if (array1.length != array2.length) {
                return false; 
            }
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] != array2[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
