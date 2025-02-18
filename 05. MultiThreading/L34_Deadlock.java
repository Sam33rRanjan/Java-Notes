// Synchronized keyword/lock is the cause for deadlock
// to remove deadlock, remove deadlock from any of last method of class A or B

class L34_A {
    public synchronized void first(L34_B obj) {
        System.out.println("Main Thread starts execution of first method of class A");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Main Thread trying to call B's last method");
        obj.last();
    }

    public void last() {
        System.out.println("last() method of class A");
    }
}

class L34_B {
    public synchronized void second(L34_A obj) {
        System.out.println("t1 starts execution of second method of class B");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("t1 trying to call A's last method");
        obj.last();
    }

    public synchronized void last() {
        System.out.println("last() method of class B");
    }
}

class L34_Thread1 extends Thread {
    L34_A a;
    L34_B b;

    L34_Thread1(L34_A a, L34_B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        b.second(a);
    }
}

public class L34_Deadlock {
    public static void main(String[] args) {
        L34_A a = new L34_A();
        L34_B b = new L34_B();

        L34_Thread1 t1 = new L34_Thread1(a, b);
        t1.start();
        a.first(b);
    }
}
