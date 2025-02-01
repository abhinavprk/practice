package abhi.practice.interview.n6.problem2;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 4, 3}, 2, 4)));
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 6}, 4, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 4, 6)));
        System.out.println(Arrays.toString(solution(new int[]{6, 1}, 1, 1)));
    }

    private static int[] solution(int[] A, int F, int M) {
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
        if (meanPossible(countOfKnownRolls, sumOfUnknownRolls)) {
            //re-initialize the result arr to the size equal to the number of unknown rolls
            res = new int[F];
            //We can have value for every roll at least equal to the sumOfUnknownRolls / no of rolls
            int initialVal = sumOfUnknownRolls / F;
            //Assign the values to every index, and reduce sumOfUnknownRolls by initialVal each time
            for (int i = 0; i < res.length; i++) {
                res[i] = initialVal;
                sumOfUnknownRolls -= initialVal;
            }
            //Now we need to assign remaining sumOfUnknownRolls to the indices
            for (int i = 0; i < res.length; i++) {
                //if sumOfUnknownRolls is already 0, we have a possible result, don't process furter
                if (sumOfUnknownRolls == 0) {
                    break;
                }
                //if not, get the roll value of the current index
                int curr = res[i];
                //its remaining capacity is calculated
                int capacity = 6 - curr;
                if (capacity >= sumOfUnknownRolls) {
                    //If the capacity is greater or equal to the sumOfUnknownRolls, all remaining sumOfUnknownRolls can be added to this index
                    res[i] = curr + sumOfUnknownRolls;
                    //break out from here
                    break;
                } else {
                    //we can add the value equal to capacity to current index and reduce the sumOfUnknownRolls by those numbers, to be assigned to
                    //the next index, or so on
                    res[i] = curr + capacity;
                    sumOfUnknownRolls -= capacity;
                }
            }
        }
        return res;
    }


    private static boolean meanPossible(int countOfUnknownRoles, int sumOfUnknownRolls) {
        return (sumOfUnknownRolls <= countOfUnknownRoles * 6) && (sumOfUnknownRolls >= countOfUnknownRoles);
    }
}
