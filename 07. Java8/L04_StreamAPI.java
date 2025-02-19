import java.util.ArrayList;
import java.util.stream.Stream;

public class L04_StreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(6);
        al.add(5);
        al.add(2);
        al.add(8);
        al.add(1);

        Stream<Integer> s = al.stream();
        Stream<Integer> s1 = s.map(i -> i * 2);
        s1.forEach(n -> System.out.println(n));

        al.stream()
                    .sorted()
                    .map(i -> i * 2)
                    .forEach(n -> System.out.println(n));
    }
}
