package ru.job4j;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет, что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = false;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length;i++) {
            for (int a = 0; a < data.length; a++)
                if (value[i] == data[a]) {
                    result = true;
                    break;
                }
        }
        return result;
    }
}