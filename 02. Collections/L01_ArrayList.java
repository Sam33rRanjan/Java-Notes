import java.util.*;

public class L01_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(40);  
        list.add(15);
        list.add(25);
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Index of 30: " + list.indexOf(30));
        System.out.println("If list is empty: " + list.isEmpty());
        System.out.println("If list contains 35: " + list.contains(35));
        list.add(4, 35);
        System.out.println("List after adding 35 at index 4: " + list);
        System.out.println("If list contains 35: " + list.contains(35));
        list.set(4, 45);
        System.out.println("List after setting 45 at index 4: " + list);
        list.remove(4);
        System.out.println("List after removing element at index 2: " + list);
        
        // Iterating over the list.
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        list.clear(); // Removes all elements from the list.
        System.out.println("List after clearing: " + list);
    }
}

// We can create a list for wrapper classes and not for primitive data types.
// ArrayList<int> list = new ArrayList<int>(); // This will give compilation error.
// ArrayList<Integer> list = new ArrayList<Integer>(); // This is correct.
// Array list is not synchronized.