package com.dev.leasson.lesson16;

/*
 *  Написать программу, которая, по полученному году определяет, является ли этот он високосным
 * Год  считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100,
 * то этот год не високосный, за исключением годов, делящихся на 400.
 * Например:
 * 1992 - високосный
 * 1900 - не високосный
 * 2000 - високосный
 * */
public class Task4 {
    public static void main(String[] args) {
        int year = 1992;
        System.out.println("Високосный: " + isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
            /*            return true;
        } else {
            return false;
        }*/
    }
}
