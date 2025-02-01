package abhi.practice.interview.n6.problem2;

import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 4, 3}, 2, 4)));
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 6}, 4, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 4, 6)));
        System.out.println(Arrays.toString(solution(new int[]{6, 1}, 1, 1)));
    }

    private static int[] solution (int [] A, int F, int M){
        //Initiate result array with one element for the cases when the mean is not possible
        int[] res = new int[1];
        int sumOfKnownRolls = 0;
        int countOfKnownRolls = A.length;
        //get sum of all roles
        for (int roll : A) {
            sumOfKnownRolls += roll;
        }
        int sumOfUnknownRolls = (M * (countOfKnownRolls + F)) - sumOfKnownRolls;
        //Proceed only if the mean is possible
        if(meanPossible(countOfKnownRolls, sumOfUnknownRolls)) {
            //re-initialize the result arr to the size equal to the number of unknown rolls
            res = new int[F];
            //We can have value for every roll at least equal to the sumOfUnknownRolls / no of rolls
            int initialVal = sumOfUnknownRolls / F;
            //extra will always be less than F
            //for example, if F is 6 & sumOfUnknownRolls is 35, the extra would be 5
            int extra = sumOfUnknownRolls % F ;
            //Assign the values to every index, and reduce sumOfUnknownRolls by initialVal each time
            for (int i = 0; i < res.length; i++) {
                if((extra > 0) && (extra <= (6 - initialVal))){
                    res[i] = initialVal + extra;
                    extra = 0;
                } else if ((extra > 0) && (extra > (6 - initialVal))){
                    res[i] = 6;
                    extra = extra - (6 - initialVal);
                } else {
                    res[i] = initialVal;
                }
                sumOfUnknownRolls -= initialVal;
            }
        }
        return res;
    }


    private static boolean meanPossible(int countOfUnknownRoles, int sumOfUnknownRolls) {
        return (sumOfUnknownRolls <= countOfUnknownRoles * 6) && (sumOfUnknownRolls >= countOfUnknownRoles);
    }
}
