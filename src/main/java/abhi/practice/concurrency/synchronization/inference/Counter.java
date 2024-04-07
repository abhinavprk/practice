package abhi.practice.concurrency.synchronization.inference;

public class Counter {

    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }
}
