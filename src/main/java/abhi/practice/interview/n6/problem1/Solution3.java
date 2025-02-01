package abhi.practice.interview.n6.problem1;

public class Solution3 {

    public static void main(String[] args) {
        solution(12345);
        solution(10011);
        solution(1);
        solution(100);

    }

    private static void solution(int num) {
        //Track if we have printed anything yet. We don't print anything until we find first non-zero digit.
        boolean hasAlreadyPrinted = false;
        while(num > 0){
            int curr = num % 10;
            if(!((curr == 0) && !hasAlreadyPrinted)){
                //If curr digit is not zero, and hasAlreadyPrinted is still false, make the first print, and update hasAlreadyPrinted to true
                System.out.print(curr);
                hasAlreadyPrinted = true;
            }
            //Update the number
            num = num / 10;
        }
        System.out.println();
    }
}


/**
 *
 *     100000
 *     100000 % 10 = 0
 *
 *
 *
 */
