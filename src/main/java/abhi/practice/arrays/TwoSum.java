package abhi.practice.arrays;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int sum = 9;
        int[] index = findTwoSumBetter(nums, sum);
        System.out.println(Arrays.toString(index));
    }

    private static int[] findTwoSum(int[] nums, int sum) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        Map<Integer, List<Integer>> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> indexes = integerMap.getOrDefault(nums[i], new ArrayList<>());
            indexes.add(i);
            integerMap.put(nums[i], indexes);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = sum - nums[i];
            List<Integer> complementIndex = integerMap.get(complement);
            if (Objects.nonNull(complementIndex)) {
                if (complementIndex.size() == 1) {
                    int compInd = complementIndex.getFirst();
                    if (compInd != i) {
                        res[0] = i;
                        res[1] = compInd;
                        return res;
                    }
                } else if (complementIndex.size() == 2) {
                    int compInd = complementIndex.get(1);
                    if (compInd != i) {
                        res[0] = i;
                        res[1] = compInd;
                        return res;
                    }
                }
            }
        }
        return res;
    }

    private static int[] findTwoSumBetter(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (integerMap.containsKey(complement)) {
                res[0] = integerMap.get(complement);
                res[1] = i;
                return res;
            }
            integerMap.put(nums[i], i);
        }
        return res;
    }
}
