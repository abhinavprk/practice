package abhi.practice.interview.n6.problem1;

public class Solution4 {

    public static void main(String[] args) {
        solution(12345);
        solution(10011);
        solution(1);
        solution(100);

    }

    private static void solution(int num) {
        //Remove all the trailing zeros from the number
        while (num % 10 == 0) {
            num = num / 10;
        }
        //Print remaining numbers
        while (num > 0) {
            int curr = num % 10;
            System.out.print(curr);
            //Update the number
            num = num / 10;
        }
        System.out.println();
    }
}


