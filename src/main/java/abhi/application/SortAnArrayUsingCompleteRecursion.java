package abhi.application;

import java.util.Arrays;

public class SortAnArrayUsingCompleteRecursion {
    public static void main(String[] args) {
        int [] arr = new int[]{3, 5, 2, 9, 1, 8, 12, 35, 22};
        System.out.println(Arrays.toString(arr));
        sortTheArray(arr, 9);
        System.out.println(Arrays.toString(arr));

    }

    private static void sortTheArray(int[] arr, int size) {
        if(size <= 1) {
            return;
        }
        int lastIndexVal = arr[size-1];
        sortTheArray(arr, size-1);
        insertTheValue(arr, size-1, lastIndexVal);
    }

    private static void insertTheValue(int[] arr, int n, int value) {
        // Base case: If we've reached the start of the array or found the correct position
        if (n == 0 || arr[n - 1] <= value) {
            arr[n] = value;
            return;
        }

        // Shift the larger element one position to the right
        arr[n] = arr[n - 1];

        // Recursively insert the value into the correct position
        insertTheValue(arr, n - 1, value);
    }


}
