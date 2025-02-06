public class L21_Strings {
    public static void main(String[] args) {
        String name = new String("John");
        System.out.println("Hello " + name);
        System.out.println(name.hashCode());
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" Doe"));

        String name2 = "John";
        System.out.println(name == name2);
    }
}

// Strings are immutable in Java (modifications can be made but a new string is created)