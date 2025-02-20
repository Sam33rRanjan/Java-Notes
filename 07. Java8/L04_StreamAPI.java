import java.util.*;
import java.util.stream.*;

public class L04_StreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(6);
        al.add(5);
        al.add(2);
        al.add(8);
        al.add(1);

        Stream<Integer> s = al.stream();
        Stream<Integer> s1 = s.filter(i -> i % 2 == 0);
        s1.forEach(n -> System.out.println(n));

        al.stream()
                    .sorted()
                    .map(i -> i * 2)
                    .forEach(n -> System.out.println(n));

        List<Integer> l = al.stream()
                    .filter(i -> i % 2 == 0)
                    .collect(Collectors.toList());
        System.out.println(l);

        long len = al.stream()
                    .filter(i -> i % 2 != 0)
                    .count();
        System.out.println(len);

        Comparator<Integer> c1 = (i1, i2) -> i2.compareTo(i1);
        Comparator<Integer> c2 = (i1, i2) -> i1.compareTo(i2);
        al.stream()
                    .sorted(c1)
                    .forEach(n -> System.out.println(n));

        Integer mx = al.stream().max(c2).get(); // returns the last element of the custom sorted list
        System.out.println(mx); 
        Integer mn = al.stream().min(c1).get(); // returns the first element of the custom sorted list
        System.out.println(mn);

        Integer[] arr = al.stream().toArray(Integer[]::new);
        for(Integer i : arr) {
            System.out.println(i);
        }
    }
}

// java.util.stream -> processng objects in a collection
// java.io.stream -> processng data from a source

// Collection -> represents a group of objects as a single unit
// Stream -> process a group of collection objects

// Stream methods can be sed only on stream objects and not on collection objects.
// Collection objects can be converted to stream objects using stream() method.

// can process the objects using two ways:
// 1. Configuration: filter(uses predicate), map(uses function), sorted, distinct
// 2. Processing: collect(uses collector), forEach(uses consumer), count(), reduce(uses binary operator), sorted(), min(), max(), toArray()
