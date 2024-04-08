package abhi.practice.concurrency.synchronization.interference;

public class Main implements Runnable{
    Counter c = new Counter();
    @Override
    public void run() {
        c.increment();
    }

    public static void main(String[] args) {
        Main main = new Main();
        int i = 1000000;
        while(i>0){
            new Thread(main).start();
            i--;
        }
     main.printValue();
    }

    private void printValue() {
        System.out.println("c: " + this.c.value());
    }
}
