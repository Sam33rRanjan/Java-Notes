import java.util.*;

public class L06_LinkedHashSet {
    public static void main(String[] args) {
        int[] arr = {21, 23, 43, 53, 22, 64};
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for(int i=0;i<arr.length;i++) {
            set.add(arr[i]);
        }
        System.out.println("The set is: " + set);

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        Integer[] arr2 = new Integer[10];
        set.toArray(arr2);
        for(int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.println("If set contains 43: " + set.contains(43));
    }
}

// Linked hash set follows hash table and doubly linked list data structure.
// Duplicate elements are not allowed.
// Elements are stored in the order in which they are inserted.
// LinkedHashSet is non-synchronized.
