package abhi.practice.interview.n6.problem1;

public class Solution1 {

    public static void main(String[] args) {
        solution(12345);
        solution(10011);
        solution(1);
        solution(100);

    }

    private static void solution(int N) {
        //Track if we have printed anything yet. We don't print anything until we find first non-zero digit.
        boolean hasPrint = false;
        while (N > 0) {
            boolean enablePrint = true;
            if (N % 10 == 0 && !hasPrint) {
                //If the current digit is zero, and we haven't printed yet anything, we won't print. Make the identifier false
                enablePrint = false;
            }
            //If enablePrint is true, print the digit and make hasPrint to true
            if (enablePrint) {
                System.out.print(N % 10);
                hasPrint = true;
            }
            N = N / 10;
        }
        System.out.println();
    }
}
