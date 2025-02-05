class L17_Parent {
    void show() {
        System.out.println("Parent");
    }
}

class L17_Child extends L17_Parent {
    void show() {
        System.out.println("Child");
    }
}

// Polymorphism is the ability of a reference variable to hold different forms
// Polymorphism is of two types:
// 1. Compile-time polymorphism (Method Overloading)
// 2. Run-time polymorphism (Method Overriding)
public class L17_Polymorphism {
    public static void main(String[] args) {
        L17_Parent p = new L17_Child();
        p.show();
        L17_Child c = new L17_Child();
        c.show();
        L17_Parent p1 = new L17_Parent();
        p1.show();
    }
}
