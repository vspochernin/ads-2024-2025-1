package ru.vspochernin;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArraysTest {

    public static final int NUM_TESTS = 100_000; // Количество тестов на каждый тип.
    public static final int MAX_ARRAY_SIZE = 100; // Максимальный размер массива на каждую итерацию теста.

    public Random random = new Random();

    @Test
    public void testByteBinarySearchRandomArrays() {
        for (int i = 0; i < NUM_TESTS; i++) {
            random = new Random();

            byte[] array = new byte[random.nextInt(MAX_ARRAY_SIZE)];
            int len = array.length;

            for (int j = 0; j < len; j++) {
                array[j] = (byte) random.nextInt(256); // Генерация случайного байта.
            }

            // Предварительная сортировка массива.
            Arrays.sort(array);

            // Берем ключ для поиска либо из массива, либо случайный.
            byte key = random.nextBoolean() && len > 0
                    ? array[random.nextInt(len)]
                    : (byte) random.nextInt(256);

            // Проверка всего массива.
            assertEquals(
                    Arrays.binarySearch(array, key),
                    MyArrays.binarySearch(array, key),
                    "Некорректный ответ для массива: " + Arrays.toString(array) +
                            ", key: " + key);

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
                            ", toIndex: " + toIndex);
        }
    }

    @Test
    public void testCharBinarySearchRandomArrays() {
        for (int i = 0; i < NUM_TESTS; i++) {
            random = new Random();

            char[] array = new char[random.nextInt(MAX_ARRAY_SIZE)];
            int len = array.length;

            for (int j = 0; j < len; j++) {
                array[j] = (char) random.nextInt(65536);
            }

            Arrays.sort(array);

            char key = random.nextBoolean() && len > 0
                    ? array[random.nextInt(len)]
                    : (char) random.nextInt(65536);

            assertEquals(
                    Arrays.binarySearch(array, key),
                    MyArrays.binarySearch(array, key),
                    "Некорректный ответ для массива: " + Arrays.toString(array) +
                            ", key: " + key);

            int fromIndex = len > 1
                    ? random.nextInt(len / 2)
                    : 0;
            int toIndex = len > 1
                    ? fromIndex + random.nextInt(len / 2)
                    : len == 1 ? 1 : 0;

            assertEquals(
                    Arrays.binarySearch(array, fromIndex, toIndex, key),
                    MyArrays.binarySearch(array, fromIndex, toIndex, key),
                    "Некорректный ответ для массива: " + Arrays.toString(array) +
                            ", key: " + key +
                            ", fromIndex: " + fromIndex +
                            ", toIndex: " + toIndex);
        }
    }

    @Test
    public void testDoubleBinarySearchRandomArrays() {
        for (int i = 0; i < NUM_TESTS; i++) {
            random = new Random();

            double[] array = new double[random.nextInt(MAX_ARRAY_SIZE)];
            int len = array.length;

            for (int j = 0; j < len; j++) {
                array[j] = random.nextDouble();
            }

            Arrays.sort(array);

            double key = random.nextBoolean() && len > 0
                    ? array[random.nextInt(len)]
                    : random.nextDouble();

            assertEquals(
                    Arrays.binarySearch(array, key),
                    MyArrays.binarySearch(array, key),
                    "Некорректный ответ для массива: " + Arrays.toString(array) +
                            ", key: " + key);

            int fromIndex = len > 1
                    ? random.nextInt(len / 2)
                    : 0;
            int toIndex = len > 1
                    ? fromIndex + random.nextInt(len / 2)
                    : len == 1 ? 1 : 0;

            assertEquals(
                    Arrays.binarySearch(array, fromIndex, toIndex, key),
                    MyArrays.binarySearch(array, fromIndex, toIndex, key),
                    "Некорректный ответ для массива: " + Arrays.toString(array) +
                            ", key: " + key +
                            ", fromIndex: " + fromIndex +
                            ", toIndex: " + toIndex);
        }
    }

    @Test
    public void testFloatBinarySearchRandomArrays() {
        for (int i = 0; i < NUM_TESTS; i++) {
            random = new Random();

            float[] array = new float[random.nextInt(MAX_ARRAY_SIZE)];
            int len = array.length;

            for (int j = 0; j < len; j++) {
                array[j] = random.nextFloat();
            }

            Arrays.sort(array);

            float key = random.nextBoolean() && len > 0
                    ? array[random.nextInt(len)]
                    : random.nextFloat();

            assertEquals(
                    Arrays.binarySearch(array, key),
                    MyArrays.binarySearch(array, key),
                    "Некорректный ответ для массива: " + Arrays.toString(array) +
                            ", key: " + key);

            int fromIndex = len > 1
                    ? random.nextInt(len / 2)
                    : 0;
            int toIndex = len > 1
                    ? fromIndex + random.nextInt(len / 2)
                    : len == 1 ? 1 : 0;

            assertEquals(
                    Arrays.binarySearch(array, fromIndex, toIndex, key),
                    MyArrays.binarySearch(array, fromIndex, toIndex, key),
                    "Некорректный ответ для массива: " + Arrays.toString(array) +
                            ", key: " + key +
                            ", fromIndex: " + fromIndex +
                            ", toIndex: " + toIndex);
        }
    }

    @Test
    public void testIntBinarySearchRandomArrays() {
        for (int i = 0; i < NUM_TESTS; i++) {
            random = new Random();

            int[] array = new int[random.nextInt(MAX_ARRAY_SIZE)];
            int len = array.length;

            for (int j = 0; j < len; j++) {
                array[j] = random.nextInt();
            }

            Arrays.sort(array);

            int key = random.nextBoolean() && len > 0
                    ? array[random.nextInt(len)]
                    : random.nextInt();

            assertEquals(
                    Arrays.binarySearch(array, key),
                    MyArrays.binarySearch(array, key),
                    "Некорректный ответ для массива: " + Arrays.toString(array) +
                            ", key: " + key);

            int fromIndex = len > 1
                    ? random.nextInt(len / 2)
                    : 0;
            int toIndex = len > 1
                    ? fromIndex + random.nextInt(len / 2)
                    : len == 1 ? 1 : 0;

            assertEquals(
                    Arrays.binarySearch(array, fromIndex, toIndex, key),
                    MyArrays.binarySearch(array, fromIndex, toIndex, key),
                    "Некорректный ответ для массива: " + Arrays.toString(array) +
                            ", key: " + key +
                            ", fromIndex: " + fromIndex +
                            ", toIndex: " + toIndex);
        }
    }
}