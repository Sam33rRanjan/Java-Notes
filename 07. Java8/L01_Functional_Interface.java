import java.util.function.*;

@FunctionalInterface
interface L01_Bird {
    void fly(String s);
    // void eat(); // Compile time error if we use @FunctionalInterface annotation as it can have only one abstract method.
}

public class L01_Functional_Interface {
    public static void main(String[] args) {
        // Anonymous class can be used to implement the interface
        L01_Bird b1 = new L01_Bird() {
            public void fly(String s) {
                System.out.println(s + " is flying");
            }
        };
        b1.fly("Sparrow");
        System.out.println(b1.getClass().getName());

        // L01_Bird b2 = (String s) -> {
        //     System.out.println(s + " is flying");
        // };
        L01_Bird b2 = (String s) -> System.out.println(s + " is flying"); // If only one line of code, we can remove curly braces.
        b2.fly("Eagle");

        Consumer<Integer> c = (Integer i) -> {
            if(i >= 5){
                System.out.println("Pen");
            } else {
                System.out.println("No Pen");
            }
        };
        c.accept(5);

        Supplier<String> s = () -> "Hello";
        System.out.println(s.get());

        Function<Integer, Integer> f = (Integer i) -> i * i;
        System.out.println(f.apply(5));

        Predicate<Integer> p = (Integer i) -> i > 5;
        System.out.println(p.test(4));
    }
}

// Functional interface are the interfaces which have only one abstract method.
// They can have default methods, static methods and Object class methods but only one abstract method.
// @FunctionalInterface annotation is used to ensure that the interface is functional interface.
// If we try to add more than one abstract method, it will throw compile time error if we use @FunctionalInterface annotation. If we don't use @FunctionalInterface annotation, it will not throw any error.
// We can use lambda expression to implement the functional interface.

// Types of functional interfaces:
// 1. Predicate<T> - It takes one argument and returns boolean value.
// 2. Function<T, R> - It takes one argument and returns a value.
// 3. Consumer<T> - It takes one argument and returns nothing.
// 4. Supplier<T> - It takes no argument and returns a value.
