interface L19_Base {
    // In an interface, all methods are public and abstract by default
    
    int age=10; // In an interface, all variables are public, static and final by default
    
    void show();
    void config();
}

interface L19_Base2 {
    void show();
    void display();
}

// Through interface, we can achieve multiple inheritance
class L19_MyClass implements L19_Base, L19_Base2 {
    // If we fail to implement the methods of the interface, this class will become abstract as it contains abstract methods by inheritance
    
    public void show() {
        System.out.println("Show method");
    }

    public void config() {
        System.out.println("Config method");
    }

    public void display() {
        System.out.println("Display method");
    }
}

public class L19_Interface {
    public static void main(String[] args) {
        L19_MyClass b = new L19_MyClass();
        b.show();
        b.config();
        b.display();
        System.out.println(L19_Base.age);

        L19_Base b2 = new L19_MyClass();
        b2.show();
        b2.config();
        // b2.display(); // Error: display() method is not in L19_Base interface

        L19_Base2 b3 = new L19_MyClass();
        b3.show();
        // b3.config(); // Error: config() method is not in L19_Base2 interface
        b3.display();
    }
}
