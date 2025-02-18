import java.util.*;

public class L05_HashSet {
    public static void main(String[] args) {
        int[] arr = {21, 23, 43, 53, 22, 64};
        HashSet<Integer> set = new HashSet<Integer>(); // Initial capacity is 16 and load factor is 0.75 .
        // HashSet<Integer> set = new HashSet<Integer>(20); // Initial capacity is 20 and load factor is 0.75 .
        // HashSet<Integer> set = new HashSet<Integer>(20, 0.9); // Initial capacity is 20 and load factor is 0.9 .
        // HashSet<Integer> set = new HashSet<Integer>(Collection c);

        for(int i=0;i<arr.length;i++) {
            set.add(arr[i]); // returns true if the element is added successfully and false if the element is already present.
        }
        System.out.println(set.add(null)); // Null value is added.
        System.out.println(set.add(null)); // Null value is not added as it is already present.
        System.out.println("The set is: " + set);

        HashSet<Integer> set2 = new HashSet<Integer>(set);
        System.out.print("The second set is: ");
        System.out.println(set2);

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        set.remove(64); // If the element is not present, then it will return false and the set will remain unchanged.
        System.out.print("The set after removing 64 is: " + set); 
    }
}

// Set interface doesn't allow duplicate elements. It is an unordered collection of objects in which duplicate values cannot be stored.
// Set interface -> Hash set class , Sorted set interface
// Hash set class -> Linked hash set class
// Sorted set interface -> Navigable set interface -> Tree set class

// Hashset can store collections like arraylist, linkedlist, vector etc.
// Follows the hash table data structure.
// Duplicate elements are not allowed.
// Insertion order is not preserved.
// HashSet is non-synchronized.
// Hashset is used when our frequent operation is search operation.