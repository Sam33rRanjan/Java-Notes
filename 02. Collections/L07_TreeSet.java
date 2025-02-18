import java.util.*;

public class L07_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(50);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(10);

        set.addAll(list);
        System.out.println("TreeSet: " + set);

        set.add(35);
        set.add(5);
        set.add(55);
        System.out.println("The first element: " + set.first());
        System.out.println("The last element: " + set.last());

        set.pollFirst();
        set.pollLast();
        System.out.println("TreeSet after removing first and last elements: " + set);

        set.remove(35);
        set.remove(45);
        System.out.println("TreeSet after removing 35 and 45: " + set);

        System.out.println("Elements greater or equal to 30: " + set.tailSet(30));
        System.out.println("Elements smaller than 30: " + set.headSet(30));
        System.out.println("Elements greater or equal to 20 and smaller than 50: " + set.subSet(20, 50));

        System.out.println("Comparator: " + set.comparator());

        System.out.println("The ceiling of 25: " + set.ceiling(25));
        System.out.println("The floor of 25: " + set.floor(25));

        set.clear();
        System.out.println("TreeSet after clearing: " + set);
    }
}

// Tree set is non-synchronized.
// Here we can't store heterogeneous objects.