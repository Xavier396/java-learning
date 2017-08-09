import java.util.*;

class search {
    private static int lookup(int[] arr, int aim) {
        for (int re = 0; re < arr.length; re++) {
            if (arr[re] == aim)
                return re;
        }
        return -1;
    }

    private static int halfSearch_2(int[] arr, int key) {
        int max = arr.length - 1;
        int min = 0;
        int mid;
        while (min <= max) {
            mid = (min + max) >> 1;
            if (key > arr[mid]) {
                min = mid + 1;
            } else if (key < arr[mid]) {
                max = mid - 1;
            } else
                return mid;
        }
        return -1;
    }

    private static int halfSearch(int[] arr, int key) {
        int min, max, mid;
        min = 0;
        max = arr.length - 1;
        mid = (max + min) / 2;
        while (arr[mid] != key) {
            if (arr[mid] > key)
                min = mid + 1;
            else if (arr[mid] < key)
                max = mid - 1;
            if (min > max)
                return -1;
            mid = (max + min) / 2;

        }
        return mid;
    }

    public static void main(String[] args) {
        int[] test1 = { 6, 99, 8, 7, 55, 3, 2, 4 };
        System.out.println(lookup(test1, 3));//¼òµ¥²éÕÒ
        int[] test = { 2, 6, 7, 8, 15, 36, 45 };
        int index = halfSearch(test, 365);
        System.out.println(index);
        int jolin=halfSearch_2(test, 45);
        System.out.println(jolin);
    }
}