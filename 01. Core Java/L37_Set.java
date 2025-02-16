import java.util.*;

public class L37_Set {
    public static void main(String[] args) {
        int[] arr = {21, 23, 43, 53, 22, 64};
        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<arr.length;i++) {
            set.add(arr[i]);
        }
        System.out.print("The set is: ");
        System.out.println(set);

        TreeSet<Integer> treeSet = new TreeSet<Integer>(set);
        System.out.print("The sorted set is: ");
        System.out.println(treeSet);

        System.out.println("The first element of the sorted set is: " + treeSet.first());
        System.out.println("The last element of the sorted set is: " + treeSet.last());
        System.out.println(treeSet.getClass());
        System.out.println(treeSet.last().getClass());
    }
}

// Set interface doesn't allow duplicate elements. It is an unordered collection of objects in which duplicate values cannot be stored.