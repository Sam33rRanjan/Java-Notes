import java.util.*;

public class L11_Map {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("C", 3);
        map.put(1, "A");
        map.put(2, "B");
        map.put("D", 4);
        map.put(null, 4);
        map.put(null, 5);

        System.out.println("Map: " + map);

        System.out.println("Value of key 1: " + map.get(1));

        System.out.println("Key 2 exists: " + map.containsKey(2));

        System.out.println("Value B exists: " + map.containsValue("B"));

        System.out.println("Size of map: " + map.size());

        System.out.println("Removing key 2: " + map.remove(2));
        System.out.println("Map after removing key 2: " + map);

        Iterator<Object> iterator = map.keySet().iterator(); // The type of iterator is of the same type as the key.
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
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
