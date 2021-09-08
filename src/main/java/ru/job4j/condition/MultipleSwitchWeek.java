package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        int result = -1;
        switch (name) {
            case "Monday":
                result = 1;
                break;
            case "Понедельник":
                result = 1;
                break;
            case "Tuesday":
                result = 2;
                break;
            case "Вторник":
                result = 2;
                break;
            case "Wednesday":
                result = 3;
                break;
            case "Среда":
                result = 3;
                break;
            case "Thursday":
                result = 4;
                break;
            case "Четверг":
                result = 4;
                break;
            case "Friday":
                result = 5;
                break;
            case "Пятница":
                result = 5;
                break;
            case "Saturday":
                result = 6;
                break;
            case "Суббота":
                result = 6;
                break;
            case "Sunday":
                result = 7;
                break;
            case "Воскресенье":
                result = 7;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MultipleSwitchWeek.numberOfDay("Tuesday"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Bobik"));
    }
}
