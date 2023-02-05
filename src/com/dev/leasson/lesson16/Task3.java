package com.dev.leasson.lesson16;

/*
 *
 * Имеется целое число. Это число - сумма денег в рублях/
 * Вывести это число, добавив к нему слово "рубль" в правильном подеже ("рубль", "рублей", "рубля").
 * */
public class Task3 {
    public static void main(String[] args) {
        int rubles = 80;
        // 1, !11 рубль
        // 2, 3, 4 !12-14 рубля
        // 0, 5, 6, 7, 8, 9, 11 - 19 рублей
        int remander10 = rubles % 10;
        int remander100 = rubles % 100;
        if (remander10 == 0 || (5 <= remander10 && remander10 <= 9) || (11 <= remander100 && remander100 <= 19)) {
            System.out.println(rubles + " рублей");
        } else if (2 <= remander10 && remander10 <= 4) {
            System.out.println(rubles + " рубля");
        } else if (remander10 == 1) {
            System.out.println(rubles + " рубль");
        } else {
            System.out.println("Rubles variable is invalid: " + rubles);
        }
    }

}