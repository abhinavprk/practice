package abhi.application;

public class FibonacciSum {

    public static void main(String[] args) {
        System.out.println(sumFib(10));
    }

    private static int sumFib(int size) {
        int sum = 1;
        int a = 0;
        int b = 1;
        size = size-2;
        while(size > 0){
            int nexInt = a + b;
            sum = sum + nexInt;
            a = b;
            b = nexInt;
            size--;
        }
        return sum;
    }
}
