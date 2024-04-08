package abhi.practice.concurrency.synchronization.interference;

public class Counter {

    private int c = 0;

    public void increment() {
        System.out.println("Thread "+ Thread.currentThread().getName());
        c++;
        System.out.println(c);
        System.out.println("Thread "+ Thread.currentThread().getName());
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }
}
