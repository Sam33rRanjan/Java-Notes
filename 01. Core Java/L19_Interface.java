interface L19_Base {
    // In an interface, all methods are public and abstract by default
    
    int age=10; // In an interface, all variables are public, static and final by default
    
    void show();
    void config();
}

class L19_MyClass implements L19_Base {
    // If we fail to implement the methods of the interface, this class will become abstract as it contains abstract methods by inheritance
    
    public void show() {
        System.out.println("Show method");
    }

    public void config() {
        System.out.println("Config method");
    }
}

public class L19_Interface {
    public static void main(String[] args) {
        L19_Base b = new L19_MyClass();
        b.show();
        b.config();
        System.out.println(L19_Base.age);
    }
}
