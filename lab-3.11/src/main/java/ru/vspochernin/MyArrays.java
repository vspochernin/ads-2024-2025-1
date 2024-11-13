package ru.vspochernin;

public class MyArrays {

    // Поиск по всему массиву.
    // 1.
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Поиск по массиву на полуинтервале [fromIndex, toIndex).
    // 2.
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

    // 3.
    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    // 4.
    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            char midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }
}
