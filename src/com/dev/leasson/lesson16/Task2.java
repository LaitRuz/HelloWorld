package com.dev.leasson.lesson16;

/*
 * Дано целое число. Определить, является ли последняя цифра этого числа - цифрой 3.
 * */
public class Task2 {
    public static void main(String[] args) {
        int value = 12345673;
        if (value % 10 == 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
