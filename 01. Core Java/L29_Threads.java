public class L29_Threads {
    public static void main(String[] args) {
        L29_CustomThread1 t1 = new L29_CustomThread1();
        t1.start();

        L29_CustomThread2 t2 = new L29_CustomThread2();
        Thread t = new Thread(t2);
        t.start();
    }
}

class L29_CustomThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("CustomThread1 is running");
    }
}

class L29_CustomThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("CustomThread2 is running");
    }
}