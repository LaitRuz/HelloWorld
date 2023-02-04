package com.dev.leasson.lesson13;

public class Lesson13Runner {
    public static void main(String[] args) {
        int value = 90;
        // boolean test = value > 0;
        if (value > 0) {
            System.out.println(value + " Positive value");
        } else if (value < 0) {
            System.out.println(value + " is not negative");
        }  else {
            System.out.println("zero");
        }
    }
}
