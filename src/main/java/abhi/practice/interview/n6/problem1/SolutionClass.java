package abhi.practice.interview.n6.problem1;

public class SolutionClass {

    public static void main(String[] args) {
        solution(12345);
        solution(10011);
        solution(1);
        solution(100);

    }

    private static void solution(int N) {
        int enable_print = 1;  // **Change 1:** Initialize enable_print to 1 to ensure at least one digit prints
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 0;
            }
            if (enable_print == 1) {  // **Change 2:** Remove 'else' to ensure the correct flow
                System.out.print(N % 10);
            }
            N = N / 10;
        }
        System.out.println();
    }
}
