package com.dev.leasson.lesson24;

public class lesson24 {
    public static void main(String[] args) {
        int[][] values = {
                { -1, 0}, // 0
                null, // 1
                {8, 65, 34, -6}, // 2
                {} // 3
        };
        System.out.println(values.length); //4
        System.out.println(values[0].length); //2
        System.out.println(values[0][1]); // 0
        System.out.println(values[2][2]); //34

    }
}
