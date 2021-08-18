package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        String result = hasMoney || beFriend ? "I can go to the club." : "I can't.";
        System.out.println(result);
    }

    public static void main(String[] args) {
        Club.permission(true, true);
        Club.permission(false, true);
        Club.permission(true, false);
        Club.permission(false, false);
    }
}
