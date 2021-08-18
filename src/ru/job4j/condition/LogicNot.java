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
        System.out.println(LogicNot.isEven(8) ? "Число четное" : "Число нечетное");
        System.out.println(LogicNot.isPositive(4) ? "Число положительное" : "Число отрицательное");
        System.out.println(LogicNot.notEven(3) ? "Число нечетное" : "Число четное");
        System.out.println(LogicNot.notPositive(10) ? "Число отрицательное" : "Число положительное");
        System.out.println(LogicNot.notEvenAndPositive(-7) ? "Число нечетное и положительное" : "Число четное и(или) отрицательное");
        System.out.println(LogicNot.evenOrNotPositive(4) ? "Число четное или отрицательное" : "Число нечетное и(или) положительное");
}

}