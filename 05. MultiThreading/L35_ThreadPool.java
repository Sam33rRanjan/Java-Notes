import java.util.concurrent.*;
// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;

class L35_Worker extends Thread {
    private String message1;
    private String message2;

    public L35_Worker(String message1, String message2) {
        this.message1 = message1;
        this.message2 = message2;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message1);
        processMessage();
        System.out.println(Thread.currentThread().getName() + " (End) message = " + message2);
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class L35_Task extends Thread {
    private int number;

    public L35_Task(int number) {
        this.number = number;
    }

    public void run() {
        for(int i=0;i<=100;i+=20) {
            System.out.println(Thread.currentThread().getName() + " Task Number:" + number + " " + i + "%");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class L35_ThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int i=0;i<10;i++) {
            L35_Worker worker = new L35_Worker("Hello " + i, "Bye " + i);
            executor.execute(worker); // we are passing the task to the executor service. The executor service will executer the task whenever a thread is available.
        }
        executor.shutdown(); // Rejects any new tasks from being submitted. Shuts down the service after previously submitted tasks are completed.
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished executor service 01");

        ExecutorService executor2 = Executors.newFixedThreadPool(2);
        for(int i=1;i<=4;i++) {
            L35_Task task = new L35_Task(i);
            executor2.execute(task);
        }
        executor2.shutdown();
        while (!executor2.isTerminated()) {
        }
        System.out.println("Finished executor service 02");
    }
}
