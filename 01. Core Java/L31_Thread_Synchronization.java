public class L31_Thread_Synchronization {
    public static void main(String[] args) {
        L31_Statements s = new L31_Statements();
        
        L31_CustomThread1 t1 = new L31_CustomThread1(s);
        L31_CustomThread1 t2 = new L31_CustomThread1(s);
        L31_CustomThread1 t3 = new L31_CustomThread1(s);

        t1.start();
        t2.start();
        t3.start();
    }
}

class L31_Statements {
    synchronized void display1() {
        Thread th=Thread.currentThread();
        for(int i=0;i<5;i++)
        {
            System.out.println(th.getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    void display2() {
        Thread th=Thread.currentThread();
        synchronized(this)
        {
            for(int i=0;i<5;i++)
            {
                System.out.println(th.getName() + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    synchronized static void display3() {
        Thread th=Thread.currentThread();
        for(int i=0;i<5;i++)
        {
            System.out.println(th.getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class L31_CustomThread1 extends Thread {
    L31_Statements s;

    L31_CustomThread1(L31_Statements s) {
        this.s = s;
    }

    @Override
    public void run() {
        // s.display1();
        // s.display2();
        L31_Statements.display3();
    }
}
