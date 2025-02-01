package abhi.practice.arrays;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(searchValue(new int[]{2, 4, 5, 8, 9, 13, 27}, 8));
        System.out.println(searchValue(new int[]{3, 4, 6, 9, 15, 27}, 4));
        System.out.println(searchValue(new int[]{3, 4, 6, 9, 15, 27}, -2));
        System.out.println(searchValue(new int[]{3, 4, 6, 9, 15, 27, 28}, 30));
        System.out.println(searchValue(new int[]{3, 4, 6, 9, 15, 27}, 30));

    }

    private static int searchValue(int[] nums, int target) {
        //Take left pointer
        int left = 0;
        //Take right pointer
        int right = nums.length - 1;
        //Run the loop until left pointer doesn't cross the right pointer
        while(left <= right) {
            //find mid between left and right
            int mid = left + (right-left)/2;
            //if value at mid equals to target, return mid
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                //if value at mid is greater than the target, this means that the value is in the left array
                //move the right pointer to the end of left array
                right = mid - 1;
            } else {
                //If the value at mid is smaller than the target, this means that the value is in the right array
                //move the left pointer to the start of the right array
                left = mid +1;
            }
        }
        //If code reaches here, this means that the target value is not in the given array
        return -1;
    }
}
