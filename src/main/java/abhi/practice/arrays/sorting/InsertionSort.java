package abhi.practice.arrays.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 12, 7, 3, 14, 8, 4};
        sortArray(arr);


    }

    private static void sortArray(int[] arr) {
        System.out.println("Input Array: " + Arrays.toString(arr));
        selectionSortBiggest(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Input Array: " + Arrays.toString(arr));
        selectionSortLowest(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }

    private static void selectionSortBiggest(int[] arr) {
        //Start form the last of the array and choose the last element
        //Compare the element with the rest of the left array, and put it at the correct positions
        for (int i = arr.length - 1; i >= 0; i--) {
            int selectedIndex = i;
            for (int j = i ; j < arr.length ; j++) {
                if(arr[selectedIndex] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[selectedIndex];
                    arr[selectedIndex] = temp;
                    selectedIndex = j;
                }
            }

        }
    }

    private static void selectionSortLowest(int[] arr) {
        //Start form the beginning of the array and choose the first element
        //Compare the element with the rest of the right array, and put it at the correct positions
        for (int i = 0; i < arr.length; i++) {
            int selectedIndex = i;
            for (int j = i ; j >= 0 ; j--) {
                if(arr[selectedIndex] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[selectedIndex];
                    arr[selectedIndex] = temp;
                    selectedIndex = j;
                }
            }
        }
    }
}
