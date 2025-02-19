interface L03_Left {
    // Default methods are inherited by the implementing class.
    default void m1() {
        System.out.println("Left default method");
    }

    // Static methods are not inherited by the implementing class.
    static void m2() {
        System.out.println("Left static method");
    }
}

class L03_Right implements L03_Left {
    public void m1() {
        System.out.println("Right default method"); // Here the default method of interface is overridden by the class method.
    }
}

public class L03_Default_and_Static_Methods {
    public static void main(String[] args) {
        L03_Right r = new L03_Right();
        r.m1();

        L03_Left.m2();
    }
}
