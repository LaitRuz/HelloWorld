package com.dev.leasson.lesson16;

/**
* Порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
*/
public class Task1 {
  /*  public static void main(String[] args) {
        int mouth = 10;
        if (mouth == 12 || mouth == 1 || mouth == 2) {
            System.out.println("Winter");
        } else if (mouth == 3 || mouth == 4 || mouth == 5) {
            System.out.println("Spring");
        } else if (mouth == 6 || mouth == 7 || mouth == 8) {
            System.out.println("Summer");
        } else if (mouth == 9 || mouth == 10 || mouth == 11){
            System.out.println("Autumn");
        } else {
            System.out.println("Mouth is invalid " + mouth);
        }
    } */

    public static void main(String[] args) {
        int mouth = 10;
        if (mouth == 12 || mouth == 1 || mouth == 2) {
            System.out.println("Winter");
        } else if (3 <= mouth && mouth <= 5) {
            System.out.println("Spring");
        } else if (6 <= mouth && mouth <= 8) {
            System.out.println("Summer");
        } else if (9 <= mouth && mouth <= 5){
            System.out.println("Autumn");
        } else {
            System.out.println("Mouth is invalid " + mouth);
        }
    }
}
