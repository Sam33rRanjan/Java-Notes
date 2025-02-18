import java.util.Comparator;
import java.util.TreeSet;

class L12_myCompare implements Comparator<Object> {
    public int compare(Object a, Object b) {
        Integer i1=(Integer)a;
        Integer i2=(Integer)b;
        // if(i1%10>i2%10) {
        //     return 1; // If we want an object to come after another object, then we return a positive value.
        // } else if(i1%10<i2%10) {
        //     return -1; // If we want an object to come before another object, then we return a negative value.
        // } else {
        //     return 0; // If we want an object to be equal to another object, then we return 0. In this case the object is not added as duplicate is not allowed.
        // }
        return i1%10< i2%10? -1 : 1;
    }
}

public class L12_Comparator_and_Comparable {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>(new L12_myCompare());
        set.add(13);
        set.add(25);
        set.add(7);
        set.add(39);
        set.add(11);
        set.add(9);
        set.add(48);
        set.add(56);

        System.out.println("The set is: " + set);
    }
}

// Comparable interface -> compareTo() method used by default sorting order.
// If we want an object to come before another object, then we return a negative value.
// If we want an object to come after another object, then we return a positive value.
// If we want an object to be equal to another object, then we return 0. In this case the object is not added as duplicate is not allowed.
// Suppose we create a collection of a custom class object, then we must implement the Comparable interface in that class so that we can create a custom sorting order for the objects of that class. In the custom class also we can override the compareTo() method for our own default sorting order.


// Comparator interface -> compare() method used to provide custom sorting order.
// Same rules as Comparable interface.
