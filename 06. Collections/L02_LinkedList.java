import java.util.*;

public class L02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(null);
        list.add(null);
        list.add(40);
        list.add(3,25);
        System.out.println("Linked List: " + list);

        list.addFirst(5);
        list.addLast(50);
        System.out.println("Linked List after adding 5 at the beginning and 50 at the end: " + list);

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println("Linked List after removing first and last elements: " + list);

        list.remove(2);
        System.out.println("Linked List after removing element at index 2: " + list);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, 27);
        System.out.println("Linked List after setting 27 at index 2: " + list);

        System.out.println("Index of 30: " + list.indexOf(30));

        System.out.println("If list contains 35: " + list.contains(35));

        list.clear();
        System.out.println("Linked List after clearing: " + list);
    }
}

// Linked list is non-synchronized.
// Linked list follows doubly linked list data structure.
// Null insertion is possible and order is preserved.
// Linked list is used when we have to perform more write operations and less read operations.