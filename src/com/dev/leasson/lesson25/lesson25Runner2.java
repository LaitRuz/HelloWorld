package com.dev.leasson.lesson25;

public class lesson25Runner2 {
    public static void main(String[] args) {
        int[][] values = {
                {1, 2, 3}, // 0
                {4, 5, 6}, // 1
                {7, 8, 9} // 2
        };
        for (int i = 0; i < values.length; i++) {
       //     System.out.println(values[i]);
            int[] array = values[i];
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
            /* for (int[] array : values) {
                for (int value : array) {
                    System.out.print(value + " ");
                }
                
            }
            */
        }
    }
}
