package abhi.application;

import java.util.stream.IntStream;

public class FindFactorial {

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
        System.out.println(findFactorial(5,1));
        System.out.println(findFactorialStream(5));
    }

    private static int findFactorial(int n) {
        if(n==1 || n == 0){
            return 1;
        }
        return n * findFactorial(n-1);
    }

    private static int findFactorial(int n, int accumulator) {
        if(n==1 || n == 0){
            return accumulator;
        }
        return  findFactorial(n-1, n * accumulator);
    }

    private static int findFactorialStream(int n){
        return IntStream.rangeClosed(1,n).reduce(1, (a,b)-> a * b);
    }
}
