package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenHiBotThenHiNerd() {
        String in = "Привет, Бот.";
        String result = DummyBot.answer(in);
        String expected = "Привет, умник.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenByeBotThenSeeYouSoonUser() {
        String in = "Пока.";
        String result = DummyBot.answer(in);
        String expected = "До скорой встречи.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenUnknownQuestionThenAskAnotherQuestion() {
        String in = "Здарово, Бот!";
        String result = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик! Задайте другой вопрос!";
        Assert.assertEquals(expected, result);
    }
}