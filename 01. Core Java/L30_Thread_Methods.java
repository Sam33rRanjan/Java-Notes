public class L30_Thread_Methods {
    public static void main(String[] args) {
        L30_CustomThread1 t1 = new L30_CustomThread1();
        L30_CustomThread1 t2 = new L30_CustomThread1();
        t1.start(); // start() method is used to start a thread
        // t1.run(); // run() method is used to run a thread like a normal method call. It is implicitly called by start() method
        System.out.println(t1.threadId());
        System.out.println("ID: " + t1.threadId());
        System.out.println("Name: " + t1.getName());
        t1.setName("Thread-000");
        System.out.println("Name: " + t1.getName());
        System.out.println("Priority: " + t1.getPriority());
        t1.setPriority(1);
        System.out.println("Priority: " + t1.getPriority());
        System.out.println("Status: " + t1.isAlive());
        System.out.println("State: " + t1.getState());
        
        try {
            t1.join(); // join() method is used to wait for a thread to die
        } catch (InterruptedException e) {
                System.out.println(e);
            }
        t2.start();
        System.out.println(t2.threadId());
        System.out.println("ID2: " + t2.threadId());
        System.out.println("Name2: " + t2.getName());
        System.out.println("Status: " + t1.isAlive());
        System.out.println("State: " + t1.getState());
    }
}

class L30_CustomThread1 extends Thread {
    @Override
    public void run() {
        // Thread t = Thread.currentThread();
        // Thread t = currentThread();
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
                // t.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
