package abhi.practice.interview.n6.problem2;

import java.util.Arrays;

public class Solution3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 4, 3}, 2, 4)));
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 6}, 4, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 4, 6)));
        System.out.println(Arrays.toString(solution(new int[]{6, 1}, 1, 1)));
    }

    private static int[] solution (int [] A, int F, int M){
        //get sum of all roles
        int sumOfKnownRolls = Arrays.stream(A).sum();;
        int countOfKnownRolls = A.length;

        int sumOfUnknownRolls = (M * (countOfKnownRolls + F)) - sumOfKnownRolls;
        //Proceed only if the mean is possible

        // Check if the sum of unknown rolls is possible
        if (sumOfUnknownRolls < F || sumOfUnknownRolls > F * 6) {
            return new int[]{0};  // Impossible case
        }
        int[] res = new int[F];
        int remaining = sumOfUnknownRolls - F;  // Subtract the minimum value (1 for each roll)

        // Distribute remaining sum across the rolls without exceeding 6
        for (int i = 0; i < F; i++) {
            int add = Math.min(5, remaining);  // Add at most 5 to make total 6
            res[i] = 1 + add;  // Start from 1, add up to 5
            remaining -= add;
            if (remaining == 0) break;  // Stop once all extra sum is distributed
        }
        return res;
    }


}
