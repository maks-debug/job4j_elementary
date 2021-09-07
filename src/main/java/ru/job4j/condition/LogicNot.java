package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        String rsl1 = LogicNot.isEven(8) ? "Число четное" : "Число нечетное";
        String rsl2 = LogicNot.isPositive(4) ? "Число положительное" : "Число отрицательное";
        String rsl3 = LogicNot.notEven(3) ? "Число нечетное" : "Число четное";
        String rsl4 = LogicNot.notPositive(10) ? "Число отрицательное" : "Число положительное";
        String rsl5 = LogicNot.notEvenAndPositive(-7) ? "Число нечетное и положительное" : "Число четное и(или) отрицательное";
        String rsl6 = LogicNot.evenOrNotPositive(4) ? "Число четное или отрицательное" : "Число нечетное и(или) положительное";
        System.out.println(rsl1);
        System.out.println(rsl2);
        System.out.println(rsl3);
        System.out.println(rsl4);
        System.out.println(rsl5);
        System.out.println(rsl6);
}

}