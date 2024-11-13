package ru.vspochernin;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArraysTest {

    public static final int NUM_TESTS = 1000000; // Количество тестов на каждый тип.
    public static final int MAX_ARRAY_SIZE = 100; // Максимальный размер массива на каждую итерацию теста.

    public Random random = new Random();

    @Test
    public void testByteBinarySearchRandomArrays() {
        for (int i = 0; i < NUM_TESTS; i++) {
            random = new Random();

            byte[] array = new byte[random.nextInt(MAX_ARRAY_SIZE)];
            int len = array.length;

            for (int j = 0; j < len; j++) {
                array[j] = (byte) random.nextInt(Byte.MIN_VALUE * Byte.MIN_VALUE); // Генерация случайного байта.
            }

            // Предварительная сортировка массива.
            Arrays.sort(array);

            // Берем ключ для поиска либо из массива, либо случайный.
            byte key = random.nextInt(10) >= 5 && len > 0
                    ? array[random.nextInt(len)]
                    : (byte) random.nextInt(Byte.MIN_VALUE * Byte.MIN_VALUE);

            // Проверка всего массива
            assertEquals(
                    Arrays.binarySearch(array, key),
                    MyArrays.binarySearch(array, key),
                    "Некорректный ответ для массива: " + Arrays.toString(array) + ", key: " + key);

            int fromIndex = len > 1
                    ? random.nextInt(len / 2)
                    : 0;
            int toIndex = len > 1
                    ? fromIndex + random.nextInt(len / 2)
                    : len == 1 ? 1 : 0;

            // Проверка для полуинтервала массива.
            assertEquals(
                    Arrays.binarySearch(array, fromIndex, toIndex, key),
                    MyArrays.binarySearch(array, fromIndex, toIndex, key),
                    "Некорректный ответ для массива: " + Arrays.toString(array) +
                            ", key: " + key +
                            ", fromIndex: " + fromIndex +
                            ", toIndex: " + toIndex
            );
        }
    }
}