import java.util.function.*;
import java.util.*;

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

        // L01_Bird b2 = (s) -> {
        //     System.out.println(s + " is flying"); // No need to mention the data type of the argument as compiler can infer it from method signature in the interface.
        // };
        L01_Bird b2 = (s) -> System.out.println(s + " is flying"); // If only one line of code, we can remove curly braces.
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

        Supplier<Date> s1 = () -> new Date();
        System.out.println(s1.get());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(s1.get());

        Function<String, Integer> f = s2 -> s2.length();
        System.out.println(f.apply("Incture"));

        Predicate<Integer> p = i -> i > 5;
        System.out.println(p.test(4));

        Predicate<ArrayList> p1 = i -> i.isEmpty();
        ArrayList al = new ArrayList<>();
        System.out.println(p1.test(al));
        
        // Runnable r = () -> System.out.println("Hello"); // Lambda expression
        // Thread t1 = new Thread(r);
        // t1.start();
        Runnable r1 = () -> { 
            for(int i = 0; i < 5; i++) {
                System.out.println("Child Thread");
            } 
        }; // If we have more than one line of code, we need to use curly braces.
        Thread t2 = new Thread(r1);
        t2.start();
        for(int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}

// Functional interface are the interfaces which have only one abstract method.
// They can have default methods, static methods and Object class methods but only one abstract method.
// @FunctionalInterface annotation is used to ensure that the interface is functional interface.
// If we try to add more than one abstract method, it will throw compile time error if we use @FunctionalInterface annotation. If we don't use @FunctionalInterface annotation, it will not throw any error.
// We can use lambda expression to implement the functional interface.
// Lambda fuctions are functions without name, return type and access modifier.

// Types of functional interfaces:
// 1. Predicate<T> - It takes one argument and returns boolean value. has methods like test, and, or, negate.
// 2. Function<T, R> - It takes one argument and returns a value.
// 3. Consumer<T> - It takes one argument and returns nothing.
// 4. Supplier<T> - It takes no argument and returns a value.
