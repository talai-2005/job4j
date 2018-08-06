package ru.job4j;

public class Board {

    StringBuilder screen = new StringBuilder();

    public String paint(int width, int height) {
        String ln = System.lineSeparator();

        for (int i = 1; i <= height; i++) {
            for (int a = 1; a <= width; a++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((a + i) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
