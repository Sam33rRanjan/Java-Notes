public class L21_Strings {
    public static void main(String[] args) {
        String name = new String("John"); // Created in the heap memory
        System.out.println("Hello " + name);
        System.out.println(name.hashCode());
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" Doe"));

        String name2 = "John"; // Created in the string constant pool (SCP)
        System.out.println(name == name2);

        String name3 = "John";
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());

        String name4 = new String("John");
        System.out.println(name4.hashCode());
        System.out.println(name.hashCode());
        // If object content is same then hashcode is same

        System.out.println(name2==name3);
        System.out.println(name==name4);

        String name5 = new String("john");
        String name6 = "john";
        System.out.println(name5.hashCode());
        System.out.println(name6.hashCode());

        String s1="Good"; // SCP
        final String s2="Morning"; // SCP
        String s3="GoodMorning"; // SCP
        String s4="Good"+"Morning"; // SCP
        String s5=new String("GoodMorning"); // Heap
        String s6=s1+"Morning"; // Heap as s1 is a variable so it is not a constant and value assigned at runtime
        String s7="Good"+s2; // SCP as s2 is constant due to final keyword and value assigned at compile time

        System.out.println(s3==s4); // true
        System.out.println(s3==s5); // false
        System.out.println(s3==s6); // false
        System.out.println(s3==s7); // true
    }
}

// Strings are immutable in Java (modifications can be made but a new string is created)

// Hashcode is dependent on .equals() method
// If equals method return true then hashcode is same
// If equals method return false then hashcode may or may not be same
// For object class equals method is same as == operator which returns true if both references are pointing to the same object
// For string class equals method is overridden to compare the content of the strings and not the references