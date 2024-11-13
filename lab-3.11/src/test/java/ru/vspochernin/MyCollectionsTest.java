package ru.vspochernin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyCollectionsTest {

    public static final int NUM_TESTS = 100_000;
    public static final int MAX_LIST_SIZE = 100;

    public Random random = new Random();

    @Test
    public void testGenericComparableBinarySearchRandomLists() {
        for (int i = 0; i < NUM_TESTS; i++) {
            random = new Random();

            int len = random.nextInt(MAX_LIST_SIZE);
            List<Point> list = new ArrayList<>(len);

            for (int j = 0; j < len; j++) {
                list.add(Point.getRandom(random));
            }

            list.sort(Point::compareTo);

            Point key = random.nextBoolean() && len > 0
                    ? list.get(random.nextInt(len))
                    : Point.getRandom(random);

            assertEquals(
                    Collections.binarySearch(list, key),
                    MyCollections.binarySearch(list, key),
                    "Некорректный ответ для списка: " + list + ", key: " + key);
        }
    }

    @Test
    public void testGenericComparatorBinarySearchRandomLists() {
        for (int i = 0; i < NUM_TESTS; i++) {
            random = new Random();

            int len = random.nextInt(MAX_LIST_SIZE);
            List<Point> list = new ArrayList<>(len);

            for (int j = 0; j < len; j++) {
                list.add(Point.getRandom(random));
            }

            list.sort(Point.comparator);

            Point key = random.nextBoolean() && len > 0
                    ? list.get(random.nextInt(len))
                    : Point.getRandom(random);

            assertEquals(
                    Collections.binarySearch(list, key, Point.comparator),
                    MyCollections.binarySearch(list, key, Point.comparator),
                    "Некорректный ответ для списка: " + list + ", key: " + key);
        }
    }
}