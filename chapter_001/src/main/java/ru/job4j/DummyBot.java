package ru.job4j;

public class DummyBot {

    /**
     * @author Nikolai Filatov (mailto:parsentev@yandex.ru)
     * @version $Id$
     * @since 0.1
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {

            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}






