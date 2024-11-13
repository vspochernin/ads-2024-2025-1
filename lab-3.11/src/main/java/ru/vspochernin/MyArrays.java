package ru.vspochernin;

public class MyArrays {

    // Поиск по всему массиву.
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Поиск по массиву на полуинтервале [fromIndex, toIndex).
    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Середина массива.
            byte midVal = a[mid];

            if (midVal < key) {
                low = mid + 1; // Ключ в правой половине.
            } else if (midVal > key) {
                high = mid - 1; // Ключ в левой половине.
            } else {
                return mid; // Ключ найден.
            }
        }
        return -(low + 1);  // Ключ не найден.
    }
}
