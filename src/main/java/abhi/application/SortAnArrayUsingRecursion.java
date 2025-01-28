package abhi.application;

import java.util.Arrays;

public class SortAnArrayUsingRecursion {
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
        int maxIndex = findMaxIndex(arr, size);
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[size - 1];
        arr[size - 1] = temp;
        sortTheArray(arr, size-1);
    }

    private static int findMaxIndex(int[] arr, int size) {
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
