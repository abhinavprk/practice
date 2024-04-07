package abhi.practice.concurrency.basic;

public class ThreadMain{

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Paint(), "Paint");
        Thread t2 = new Thread(new Clean(), "Clean");
        t1.start();
        t2.start();
        System.out.println("Main waiting for painting to be completed");
        t1.join();
        System.out.println("Main:" + Thread.currentThread().getName());
    }
}
