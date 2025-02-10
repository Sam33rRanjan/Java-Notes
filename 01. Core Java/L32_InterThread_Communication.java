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

public class L32_InterThread_Communication {
    public static void main(String[] args) {
        L32_Shared shared = new L32_Shared();
        L32_Producer producer = new L32_Producer(shared);
        L32_Consumer consumer = new L32_Consumer(shared);
        producer.start();
        consumer.start();
    }
}

// We can achieve inter-thread communication using wait(), notify(), and notifyAll() methods