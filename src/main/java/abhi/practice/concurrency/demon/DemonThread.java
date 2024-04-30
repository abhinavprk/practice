package abhi.practice.concurrency.demon;

public class DemonThread {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");

        Thread runnableThread = getRunnableThread();
        /*
        If a thread is set as a daemon thread, the main thread will exit as soon as main thread
        finishes.It will not wait for the daemon thread to be finished.
        On the contrary, the main thread will wait after main thread is done with it's processing
        for all the non daemon threads to be completed.
         */
        runnableThread.setDaemon(true);
        runnableThread.start();
        System.out.println("Sleeping before Bye World!");
        Thread.sleep(5000);
        System.out.println("Bye World!");

    }

    private static Thread getRunnableThread() {
        Thread threadObj = new Thread(() -> System.out.println("Thread Object is running."));

        threadObj.start();

        Runnable runnable = () -> {
            System.out.println("Runnable Thread is running.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runnable is done!");
        };

        return new Thread(runnable);
    }
}
