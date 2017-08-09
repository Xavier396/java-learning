import java.util.*;

class imp {
    public static void main(String[] args) {
        int[] arra = { 5, 4, 8, 2, 3, 66, 7, 75, 93, 11 };
        printArray(arra);
        Arrays.sort(arra);
        printArray(arra);

    }

    public static void printArray(int[] arr) {
        System.out.print("สýื้ฃบ[");
        for (int j = 0; j < arr.length; j++) {
            if (j != arr.length - 1)
                System.out.print(arr[j] + ",");
            else
                System.out.println(arr[j] + "]");
        }
    }
}
