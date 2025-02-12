// Inter-thread communication is used when shared resource is modified and is being used by multiple threads. It is used to prevent thread interference and data inconsistency.
// We can achieve inter-thread communication using wait(), notify(), and notifyAll() methods

//wait(), notify(), and notifyAll() methods are defined in Object class

// t1->starts-> needs updation-> call wait()-> t1 releases the lock on object immediately-> t2 gets lock-> t2 updates->calls notify() or notifyAll()-> t2 releases the lock but not immediately-> t1 gets lock

class L32_Shared {
    int num;
    boolean flag = false;
    public synchronized void setNum(int num) {
        while(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.num = num;
        System.out.println("Set: " + num);
        flag = true;
        notify();
    }
    public synchronized void getNum() {
        while(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Get: " + num);
        flag = false;
        notify();
    }
}

class L32_Producer extends Thread {
    L32_Shared shared;
    L32_Producer(L32_Shared shared) {
        this.shared = shared;
    }
    @Override
    public void run() {
        int i = 0;
        while(true) {
            shared.setNum(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class L32_Consumer extends Thread {
    L32_Shared shared;
    L32_Consumer(L32_Shared shared) {
        this.shared = shared;
    }
    @Override
    public void run() {
        while(true) {
            shared.getNum();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class L32_Sum extends Thread {
    int total=0;
    @Override
    public void run() {
        synchronized(this) {
            System.out.println("Child thread starts calculation");
            for(int i = 0; i <= 100; i++) {
                total += i;
            }
            System.out.println("Child thread giving notification");
            this.notify();
        }
    }
}

public class L32_InterThread_Communication {
    public static void main(String[] args) {
        // L32_Shared shared = new L32_Shared();
        // L32_Producer producer = new L32_Producer(shared);
        // L32_Consumer consumer = new L32_Consumer(shared);
        // producer.start();
        // consumer.start();

        L32_Sum s1 = new L32_Sum();
        s1.start();
        synchronized(s1) {
            try {
                System.out.println("Main thread waiting for child thread to complete calculation");
                s1.wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Main thread got notification");
            System.out.println("Total: " + s1.total);
        }
    }
}

// Suppose there are 7 threads t1,t2,t3,t4,t5,t6,t7. t1,t2,t3 are waiting for the lock on object 1. t4,t5,t6,t7 are waiting for the lock on object 2. t8 thread nofiies all the threads waiting for the lock on object 1. t1,t2,t3 will get the lock on object 1 if t8 calls notifyAll(). t9 thread notifies all the threads waiting for the lock on object 2. t4,t5,t6,t7 will get the lock on object 2 if t9 calls notifyAll().