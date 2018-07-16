package ru.job4j;

/**
 * @author Nikolai
 * @version $Id$
 * @since 0.1
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point that) {

        Point a = this;

        Point b = that;

        int x1 = a.x;
        int y1 = a.y;
        int x2 = b.x;
        int y2 = b.y;

        double result = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
        return result;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        Point c = new Point(4, 6);
        System.out.println("Расстояние между точками А и В : " + a.distanceTo(b));
        double result1 = a.distanceTo(c);
        System.out.println("Расстояние между точками А и C : " + a.distanceTo(c));
        double result2 = b.distanceTo(c);
        System.out.println("Расстояние между точками B и C : " + b.distanceTo(c));
    }

}
