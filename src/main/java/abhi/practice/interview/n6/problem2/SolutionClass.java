package abhi.practice.interview.n6.problem2;

import java.util.Arrays;

public class SolutionClass {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 4, 3}, 2, 4)));
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 6}, 4, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 4, 6)));
        System.out.println(Arrays.toString(solution(new int[]{6, 1}, 1, 1)));
    }

    private static int[] solution (int [] A, int F, int M){
        int[] res = new int[1];
        int sumOfKnownRolls = 0;
        int countOfKnownRolls = A.length;
        //get sum of all roles
        for (int roll : A) {
            sumOfKnownRolls += roll;
        }
        int sumOfUnknownRolls = (M * (countOfKnownRolls + F)) - sumOfKnownRolls;
        if(meanPossible(countOfKnownRolls, sumOfUnknownRolls)) {
            res = new int[F];
            int initialVal = sumOfUnknownRolls / F;
            for (int i = 0; i < res.length; i++) {
                res[i] = initialVal;
                sumOfUnknownRolls -= initialVal;
            }

            for (int i = 0; i < res.length; i++) {
                if (sumOfUnknownRolls == 0) {
                    break;
                }
                int curr = res[i];
                int capacity = 6 - curr;
                if (capacity >= sumOfUnknownRolls) {
                    res[i] = curr + sumOfUnknownRolls;
                    sumOfUnknownRolls = 0;
                } else {
                    res[i] = curr + capacity;
                    sumOfUnknownRolls -= capacity;
                }

            }
        }
        return res;
    }

    private static boolean meanPossible(int countOfUnknownRoles, int sumOfUnknownRolls) {
        boolean isPossible = true;
        if((sumOfUnknownRolls > countOfUnknownRoles * 6) || (sumOfUnknownRolls < countOfUnknownRoles))
        {
            isPossible = false;
        }
        return isPossible;
    }
}
