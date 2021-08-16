package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String lsr = "Это ставит меня в тупик! Задайте другой вопрос!";
        if ("Привет, Бот.".equals(question)) {
            lsr = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            lsr = "До скорой встречи.";
        }
        return lsr;
    }

    public static void main(String[] args) {
        String question = "Здарово, Бот!";
        System.out.println(DummyBot.answer(question));
        question = "Привет, Бот.";
        System.out.println(DummyBot.answer(question));
        question = "Пока.";
        System.out.println(DummyBot.answer(question));
    }
}
