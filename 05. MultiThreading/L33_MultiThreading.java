public class L33_MultiThreading {
    public static void main(String[] args) {
        L33_CustomThread1 t1 = new L33_CustomThread1();
        t1.start();
        t1.interrupt(); // interrupt() method is used to interrupt a thread. It is used to break the thread if it is in sleeping or waiting state
        System.out.println("Main thread is running");
    }
}

class L33_CustomThread1 extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("CustomThread1 is running");
    }
}

// Types of multitasking: Process-based and Thread-based
// Process based multitasking: Multiple independent processes are executed simultaneously. Each process has its own memory space.
// Thread based multitasking(multithreading): Multiple independent parts of a single process are executed simultaneously. Threads share the same memory space.
// Multithreading: Ability of a CPU to execute multiple threads concurrently.
