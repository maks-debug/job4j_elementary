package ru.job4j.condition;

public class MultipleSwitchWeek {
    /**
     * @noinspection checkstyle:MissingSwitchDefault
     */
    public static int numberOfDay(String name) {
        int result = -1;
        if ("Monday".equals(name)) {
            result = 1;
        } else if ("Понедельник".equals(name)) {
            result = 1;
        } else if ("Tuesday".equals(name)) {
            result = 2;
        } else if ("Вторник".equals(name)) {
            result = 2;
        } else if ("Wednesday".equals(name)) {
            result = 3;
        } else if ("Среда".equals(name)) {
            result = 3;
        } else if ("Thursday".equals(name)) {
            result = 4;
        } else if ("Четверг".equals(name)) {
            result = 4;
        } else if ("Friday".equals(name)) {
            result = 5;
        } else if ("Пятница".equals(name)) {
            result = 5;
        } else if ("Saturday".equals(name)) {
            result = 6;
        } else if ("Суббота".equals(name)) {
            result = 6;
        } else if ("Sunday".equals(name)) {
            result = 7;
        } else if ("Воскресенье".equals(name)) {
            result = 7;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MultipleSwitchWeek.numberOfDay("Tuesday"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Bobik"));
    }
}
