package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int result = 0;
        while (length >= section) {
            length -= section;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(SectionCount.count(2, 1));
    }
}
