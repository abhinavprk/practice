package abhi.application;

public class Print1ToN {

    public static void main(String[] args) {
        print1ToN(10);
        System.out.println();
        print1ToN(1, 25);
        System.out.println();
        printNTo1(10);
        System.out.println();
        print1ToNAnother(10);
    }

    private static void print1ToN(int n) {
        printNumber(n, 1);
    }

    private static void printNumber(int n, int i) {
        if (n > 0) {
            System.out.print(i + " ");
            printNumber(n - 1, i + 1);
        }
    }


    private static void print1ToN(int current, int n) {
        if (current <= n) {
            System.out.print(current + " ");
            current++;
            print1ToN(current, n);
        }
    }

    private static void printNTo1(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            n--;
            printNTo1(n);
        }
    }

    private static void print1ToNAnother(int n) {
        if (n > 0) {
            n--;
            print1ToNAnother(n);
            System.out.print(n+1 + " ");
        }
    }
}

