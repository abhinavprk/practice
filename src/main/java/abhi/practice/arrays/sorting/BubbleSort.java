package abhi.practice.arrays.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 12, 7, 3, 14, 8, 4};
        sortArray(arr);


    }

    private static void sortArray(int[] arr) {
        System.out.println("Input Array: " + Arrays.toString(arr));
        bubbleSortArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private static void bubbleSortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
