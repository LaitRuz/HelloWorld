package com.dev.leasson.lesson15;

public class Lesson15 {
    public static void main(String[] args) {
        var mouth = 9;
       var result = switch (mouth) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Month is invalid";
        };

        System.out.println(result);
    }
}
