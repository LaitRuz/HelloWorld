package com.dev.leasson.lesson18;

public class while1 {
    public static void main(String[] args) {
        int value = 10;
    do {
        System.out.println(value);
        value--; //value - 1; value -= 1;

    } while (value > 0);
    }


    public static void whileExample(int value) {
        while (value > 0) {
            System.out.println(value);
            value--; //value - 1; value -= 1;
        }
    }
}
