package abhi.practice.concurrency.synchronization.memoryconsistency;

import abhi.practice.concurrency.synchronization.interference.Counter;

import java.util.ArrayList;
import java.util.List;

public class Main implements  Runnable{

    Counter c = new Counter();
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        int i = 5;
        List<Thread> threads= new ArrayList<>();
        while(i>0){
            Thread t = new Thread(main);
            threads.add(t);
            t.start();
            i--;
        }
        for(Thread t: threads){
            t.join();
        }
        main.printValue();
    }

    private void printValue() {
        System.out.println("c: " + this.c.value());
    }

    @Override
    public void run() {
        c.increment();
    }
}
