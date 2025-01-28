package abhi.application;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        swapNumberAndPrint(6, 9);
        swapNumberAndPrint(34, 37);

    }

    private static void swapNumberAndPrint(int a, int b) {
        System.out.println("a is: " + a);
        System.out.println("b is: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is: " + a);
        System.out.println("b is: " + b);

    }
}
