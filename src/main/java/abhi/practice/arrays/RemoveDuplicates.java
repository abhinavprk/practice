package abhi.practice.arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));

    }

    private static int removeDuplicates(int[] nums) {
        int removedUntil = 1 ;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[removedUntil] = nums[i];
                removedUntil++;
            }
        }

        return removedUntil;
    }
}
