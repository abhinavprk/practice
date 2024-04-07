package abhi.practice.concurrency.basic;

public class Paint extends Thread{
    @Override
    public void run() {
        System.out.println("Name: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
            System.out.println("Paint the wall.");
        } catch (InterruptedException e) {
            System.out.println("Paint task interrupted.");
        }

    }
}
