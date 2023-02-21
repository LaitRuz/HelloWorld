package com.dev.leasson.lesson23;

public class lesson23Runner {
    public static void main(String[] args) {
        int[] values = new int[3]; //{0, 0, 0}
        double[] values2 = new double[3]; // {0.0, 0.0, 0.0}
        boolean[] values3 = new boolean[3]; // {false, false, false}
        char[] values4 = new char [3]; // { null, null, null}t
        System.out.println(values[2]);
    }
    private static void example1 () {
        int [] values = {1, 6, 9, -34, 109};
        System.out.println(values.length);
        System.out.println(values[4]);
        values [4] = 784;
        System.out.println(values[4]);
    }
}
