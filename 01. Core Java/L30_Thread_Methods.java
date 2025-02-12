public class L30_Thread_Methods {
    public static void main(String[] args) {
        L30_CustomThread1 t1 = new L30_CustomThread1();
        t1.start(); // start() method is used to start a thread
        // t1.run(); // run() method is used to run a thread like a normal method call. It is implicitly called by start() method
        // System.out.println(t1.threadId());
        // System.out.println("ID: " + t1.threadId());
        // System.out.println("Name: " + t1.getName());
        // t1.setName("Thread-000");
        // System.out.println("Name: " + t1.getName());
        // System.out.println("Priority: " + t1.getPriority());
        // t1.setPriority(1);
        // System.out.println("Priority: " + t1.getPriority());
        // System.out.println("Status: " + t1.isAlive());
        // System.out.println("State: " + t1.getState());
        
        try {
            t1.join(); // join() method is used to wait the current thread until the thread on which it is called is dead. Here main thread will wait until t1 is dead
            // t1.join(3000); // join() method is used to wait for a specific time and resume threads irrespective of the thread completion
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        // Thread.currentThread().setPriority(10);
        // L30_CustomThread1 t2 = new L30_CustomThread1();
        // t2.start();
        // System.out.println(t2.threadId());
        // System.out.println("ID2: " + t2.threadId());
        // System.out.println("Name2: " + t2.getName());
        // System.out.println("Priority2: " + t2.getPriority());
        // System.out.println("Status: " + t1.isAlive());
        // System.out.println("State: " + t1.getState());

        // System.out.println("Main thread: " + Thread.currentThread().getName());

        L30_CustomThread1 t3 = new L30_CustomThread1();
        // L30_CustomThread2 t4 = new L30_CustomThread2();
        // Thread t5 = new Thread(t4);
        t3.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            Thread.yield();
        }
    }
}

class L30_CustomThread1 extends Thread {
    @Override
    public void run() {
        // Thread t = Thread.currentThread();
        // Thread t = currentThread();
        for(int i=0;i<5;i++)
        {
            System.out.println("CT1: " + i);
            try {
                Thread.sleep(1000);
                // t.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            // Thread.yield();
        }
    }
}

class L30_CustomThread2 implements Runnable {
    @Override
    public void run() {
        // Thread t = Thread.currentThread();
        for(int i=0;i<5;i++)
        {
            System.out.println("CT2: " + i);
            try {
                Thread.sleep(1000);
                // t.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// .Yield() method is used as a hint for the thread scheduler to pause the execution of the current thread and give the chance to the threads of the same priority. The behavior of .yield() varies accross platform If there is no thread of the same priority or the threads have lower priority than current thread, the same thread will get the chance again. If multiple threads are waiting for the chance with same priority, the thread scheduler will choose any one of them randomly. If higher priority thread comes, the current thread will not get the chance again until the higher priority thread completes its execution.

// Windows doesn't support priority of threads so it is not recommended to use priority in threads as we may not get the expected output.