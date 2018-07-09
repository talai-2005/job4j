package ru.job4j;

public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param rubbleAmount рубли.
     * @param rubleToEuroExchangeRate курс обмена валют.
     * @return Евро.
     */
    public int rubleToEuro(int rubbleAmount, int rubleToEuroExchangeRate) {

        int rubbleToEuroResult = rubbleAmount / rubleToEuroExchangeRate;

        return rubbleToEuroResult;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param rubbleAmount рубли.
     * @param rubleToDollarExchangeRate курс обмена валют.
     * @return Доллары
     */
    public int rubleToDollar(int rubbleAmount, int rubleToDollarExchangeRate) {

        int rubbleToDollarResult = rubbleAmount / rubleToDollarExchangeRate;

        return rubbleToDollarResult;
    }
}
