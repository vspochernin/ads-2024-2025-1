package ru.vspochernin;

public class MyArrays {

    public static final double EPS_DOUBLE = 1e-9;

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

    // 5.
    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    // 6.
    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            double midVal = a[mid];

            int cmp = compare(midVal, key);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    private static int compare(double a, double b) {
        if (Math.abs(a - b) < EPS_DOUBLE) {
            return 0;
        } else {
            return a - b > 0 ? 1 : -1;
        }
    }
}
