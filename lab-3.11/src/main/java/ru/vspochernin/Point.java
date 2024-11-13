package ru.vspochernin;

import java.util.Comparator;
import java.util.Random;

public class Point implements Comparable<Point> {

    // Сравнивает сначала по x.
    public static final Comparator<Point> comparator = (o1, o2) -> {
        if (o1.x != o2.x) {
            return Integer.compare(o1.x, o2.x);
        }
        return Integer.compare(o1.y, o2.y);
    };

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point getRandom(Random random) {
        return new Point(random.nextInt(100), random.nextInt(100));
    }

    // Сравнивает сначала по y.
    @Override
    public int compareTo(Point o) {
        if (this.y != o.y) {
            return Integer.compare(this.y, o.y);
        }
        return Integer.compare(this.x, o.x);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
