import java.util.*;

public class L05_HashSet {
    public static void main(String[] args) {
        int[] arr = {21, 23, 43, 53, 22, 64};
        HashSet<Integer> set = new HashSet<Integer>(); // Initial capacity is 16 and load factor is 0.75 .
        // HashSet<Integer> set = new HashSet<Integer>(20); // Initial capacity is 20 and load factor is 0.75 .
        // HashSet<Integer> set = new HashSet<Integer>(20, 0.9); // Initial capacity is 20 and load factor is 0.9 .
        // HashSet<Integer> set = new HashSet<Integer>(Collection c);

        for(int i=0;i<arr.length;i++) {
            set.add(arr[i]);
        }
        System.out.print("The set is: ");
        System.out.println(set);

        HashSet<Integer> set2 = new HashSet<Integer>(set);
        System.out.print("The second set is: ");
        System.out.println(set2);

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        set.remove(43); // If the element is not present, then it will return false and the set will remain unchanged.
        System.out.print("The set after removing 43 is: " + set); 
    }
}

// Set interface doesn't allow duplicate elements. It is an unordered collection of objects in which duplicate values cannot be stored.
// Hashset can store collections like arraylist, linkedlist, vector etc.
// Elements are not stored in the order in which they are inserted.
// HashSet is non-synchronized.