import java.util.List;

class L02_MyPrinter {
    public void print() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class L02_Method_References {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cat", "Dog", "Elephant");
        // list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println); // Method reference

        L02_MyPrinter mp = new L02_MyPrinter();
        Runnable r = mp::print; // Method reference
        Thread t = new Thread(r);
        t.start();
        for(int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}

// Method reference is used to map the abstract method of functional interface to a non-abstract method.
// For mapping costructor we use ClassName::new
// For mapping static method we use ClassName::methodName
// For mapping instance method we use objectName::methodName
// The method signature of the abstract method and the method to which it is mapped should be same.
