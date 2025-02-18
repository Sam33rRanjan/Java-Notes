import java.util.*;

public class L11_Map {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("C", 3);
        map.put(1, "A");
        map.put(2, "B");
        map.put("D", 4);

        System.out.println("Map: " + map);
    }
}

// Map is an interface in Java that is used to store key-value pairs.
// Map interface -> Hash table class, Hash map class, Identity map class, Weak hash map class, Sorted map interface.
// Hash map -> Linked hash map.
// Sorted map interface -> Navigable map interface -> Tree map class.
// Map interface doesn't extend the collection interface.

// Hash map follows the hash table data structure.
// Duplicate keys are not allowed but duplicate values are allowed.
// Null key is allowed only once and multiple null values are allowed.
// Insertion order is not preserved.

// In linked hash map, the insertion order is preserved.
// In tree map, the elements are stored in sorted order on the basis of keys.
