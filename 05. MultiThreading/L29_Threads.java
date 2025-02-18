public class L29_Threads {
    public static void main(String[] args) {
        L29_CustomThread1 t1 = new L29_CustomThread1();
        t1.start(); // registers the thread with the thread scheduler, perform other mandatory tasks, and calls the run method of the thread. New thread is created

        L29_CustomThread2 t2 = new L29_CustomThread2();
        Thread t = new Thread(t2);
        // t.run(); // no new thread is created, it will run in main thread and is treated as a normal method
        t.start(); // new thread is created

        for(int i = 0; i <5; i++) {
            System.out.println("Main Thread is running");
        }
    }
}

class L29_CustomThread1 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("CustomThread1 is running");
        }
    }
}

class L29_CustomThread2 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("CustomThread2 is running");
        }
    }
}

// Stages of Thread Life Cycle:
// 1. New/Born: Thread is created but not started yet. Can be entered by creating an instance of Thread class using new keyword
// 2. Ready/Runnable: Thread is ready to run and waiting for the CPU cycle. Can be entered by using start() method
// 3. Running: Thread is currently running. Can be entered when CPU scheduler selects the thread for execution
// 4. Dead: Thread has completed its execution. has competed executing run() method or stop() method is called