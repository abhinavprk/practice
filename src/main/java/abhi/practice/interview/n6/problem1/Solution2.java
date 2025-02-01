package abhi.practice.interview.n6.problem1;

public class Solution2 {

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
            boolean enablePrint = true;
            int curr = num % 10;
            if((curr == 0) && !hasAlreadyPrinted){
                enablePrint = false;
            }
            if(enablePrint){
                System.out.print(curr);
                hasAlreadyPrinted = true;
            }
            num = num / 10;
        }
        System.out.println();
    }
}
