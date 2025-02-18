import java.util.*;

public class L03_VectorList {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(10);
        vector.add(20);
        vector.add(20);
        vector.addElement(30);
        vector.addElement(40);
        vector.add(3,25);

        System.out.println("Vector: " + vector);

        System.out.println("Size: " + vector.size());

        System.out.println("Element at index 2: " + vector.get(2));
        System.out.println("Element at index 2: " + vector.elementAt(2));

        System.out.println("Index of 30: " + vector.indexOf(30));

        System.out.println("If vector is empty: " + vector.isEmpty());

        System.out.println("If vector contains 35: " + vector.contains(35));

        vector.add(4, 35);
        System.out.println("Vector after adding 35 at index 4: " + vector);

        vector.remove(1);
        System.out.println("Vector after removing element at index 1: " + vector);

        Iterator<Integer> itr = vector.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        vector.clear();
        System.out.println("Vector after clearing: " + vector);
    }
}

// Vector is synchronized.
// Vector is used when we have to achieve thread safety.
