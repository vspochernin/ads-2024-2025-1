package ru.vspochernin;

public class MyArrays {

    public static final double EPS = 1e-9;

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

    // 7.
    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    // 8.
    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            float midVal = a[mid];

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

    // 9.
    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    // 10.
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

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

    // 11.
    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    // 12.
    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = a[mid];

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

    // 13.
    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    // 14.
    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            short midVal = a[mid];

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

    private static int compare(double a, double b) {
        if (Math.abs(a - b) < EPS) {
            return 0;
        } else {
            return a - b > 0 ? 1 : -1;
        }
    }

    private static int compare(float a, float b) {
        if (Math.abs(a - b) < EPS) {
            return 0;
        } else {
            return a - b > 0 ? 1 : -1;
        }
    }
}
