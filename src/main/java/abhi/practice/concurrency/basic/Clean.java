package abhi.practice.concurrency.basic;

public class Clean implements Runnable{
    @Override
    public void run() {
        System.out.println("Name: " + Thread.currentThread().getName());
        System.out.println("Clean the computer.");
    }
}
