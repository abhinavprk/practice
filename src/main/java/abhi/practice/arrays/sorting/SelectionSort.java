package abhi.practice.arrays.sorting;

import java.util.Arrays;

public class SelectionSort {
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
        //Start form the last of the array to make the right side is sorted first
        for (int i = arr.length-1; i >= 0; i--) {
            int bigIndex = i; // Assume the last index of the unsorted part is the index with the biggest element in the unsorted part
            for (int j = 0; j < i; j++) { // loop from the beginning to the last index of unsorted part to find the index with the biggest element
                if (arr[j] > arr[bigIndex]) { //If the element at the current index is bigger than the element at the bigIndex, update the bigIndex with current value
                bigIndex = j;
                }
            }
            if(bigIndex != i) { // If bigIndex is equal to i, this means that the largest element is already at its place in this pass.
                int temp = arr[i];
                arr[i] = arr[bigIndex];
                arr[bigIndex] = temp;
            }
        }
    }

    private static void selectionSortLowest(int[] arr) {
        //Start from the left side of the array to make left side sorted
        for (int i = 0; i < arr.length - 1; i++) {
            int smallIndex = i; //Assume that the first element in the unsorted part is the smallest
            for (int j = i + 1; j < arr.length; j++) { //find the index with the lowest value and update the smallIndex value with it
                if (arr[j] < arr[smallIndex]) {
                    smallIndex = j;
                }
            }
            if(smallIndex != i) { //if smallIndex is equal to i, there is no need to swap because the lowest element is already at its place in this pass
                int temp = arr[i];
                arr[i] = arr[smallIndex];
                arr[smallIndex] = temp;
            }
        }
    }
}
