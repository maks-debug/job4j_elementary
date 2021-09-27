package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        /**
         * The first option for completing the task
         *  int result = 0;
         *         while (n > d) {
         *             n -= d;
         *             result++;
         *         }
         *         if (n != d) {
         *             result = n;
         *         } else {
         *             result = 0;
         *         }
         *         return result;
         */
        while (n > d) {
            n -= d;
        }
        return n != d ? n : 0;
    }

    public static void main(String[] args) {
        System.out.println(ModWithLoop.mod(7, 3));
    }
}
