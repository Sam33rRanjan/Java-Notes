public class L23_StringBuffer {
    public static void main(String[] args) {
        // All methods in StringBuffer are synchronized
        
        StringBuffer name = new StringBuffer("John");
        // StringBuffer name2 = "John"; // This will throw an error
        System.out.println(name);
        System.out.println(name.capacity()); // Give 16 + length of the string as buffer size

        // name.setLength(10);
        // System.out.println(name.length());
        // System.out.println(name.capacity());

        // name.setLength(30);
        // System.out.println(name.length());
        // System.out.println(name.capacity());

        name.ensureCapacity(50);
        System.out.println(name.length());
        System.out.println(name.capacity());
        
        // System.out.println(name.append(" Doe"));
        // System.out.println(name);
        
        // System.out.println(name.insert(2, "Doe"));
        // System.out.println(name);
        
        // System.out.println(name.delete(1, 3)); // Deletes the characters from the index 1 to the index 2
        // System.out.println(name);

        // System.out.println(name.deleteCharAt(1)); // Deletes the character at the index 1
        // System.out.println(name);
        
        System.out.println(name.reverse());
        // System.out.println(name);

        // System.out.println(name.replace(1, 3, "Doe"));
        // System.out.println(name);

        // System.out.println(name.length());

        // System.out.println(name.substring(1));
        // System.out.println(name);

        // System.out.println(name.subSequence(1, 3));
        // System.out.println(name);

        // System.out.println(name.indexOf("oh"));

        // System.out.println(name.charAt(2));

        // System.out.println(name.hashCode());
        
        // name.setCharAt(0, 'K');
        // System.out.println(name);

    }
}
