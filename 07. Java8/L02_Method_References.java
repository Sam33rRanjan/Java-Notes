import java.util.List;

class L02_MyPrinter {
    public void print(String s) {
        System.out.println(s);
    }
}

public class L02_Method_References {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cat", "Dog", "Elephant");
        // list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println); // Method reference

        L02_MyPrinter mp = new L02_MyPrinter();
        mp.print("Hello");
    }
}
