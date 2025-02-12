public class L22_String_Methods {
    public static void main(String[] args) {
        String name = "John";
        // System.out.println(name.toUpperCase()); // Converts all characters in the string to upper case
        // System.out.println(name.toLowerCase()); // Converts all characters in the string to lower case
        // System.out.println(name.trim()); // Removes leading and trailing spaces 
        // System.out.println(name.substring(2)); // Returns a substring of the string from index 2 to last index
        // System.out.println(name.substring(1, 3)); // Returns a substring of the string from index 1 to 2
        // System.out.println(name.replace('J', 'K')); // Replaces all occurrences of the specified character
        // System.out.println(name.startsWith("Jo")); // Checks if the string starts with the specified prefix
        // System.out.println(name.endsWith("hn")); // Checks if the string ends with the specified suffix
        // System.out.println(name.charAt(2)); // Returns the character at the specified index
        // System.out.println(name.indexOf('o')); // Returns the index of the first occurrence of the specified character
        // System.out.println(name.indexOf('h', 2)); // Returns the index of the first occurrence of the specified character from a specified index
        // System.out.println(name.indexOf("oh")); // Returns the index of the first occurrence of the specified string
        // System.out.println(name.lastIndexOf('o')); // Returns the index of the last occurrence of the specified character
        // System.out.println(name.lastIndexOf('o', 2)); // Returns the index of the last occurrence of the specified character from a specified index
        System.out.println(name.equals("John")); // Compares the content of the string to the content of the specified string
        // System.out.println(name.equalsIgnoreCase("john")); // Compares the content of the string to the content of the specified string ignoring case considerations
        System.out.println(name.compareTo("john")); // Compares the string to the specified string 0:same, -ve:lexicographically less, +ve:lexicographically greater
        // System.out.println(name.compareToIgnoreCase("john")); // Compares the string to the specified string ignoring case considerations
        // System.out.println(name.contains("oh")); // Checks if the string contains the specified sequence of characters
        // System.out.println(name.isEmpty()); // Checks if the string is empty
        System.out.println(name.concat(" Doe")); // Concatenates the specified string to the end of the string
        // System.out.println(name + " Doe"); // Concatenates the specified string to the end of the string
        // System.out.println(name.length()); // Returns the length of the string
        // System.out.println(name.hashCode()); // Returns the hash code of the string 
        // System.out.println(name.toCharArray()); // Converts the string to a character array
        char[] chars = name.toCharArray();
        for(char ch:chars){
            System.out.println(ch);
        }
        // System.out.println(String.valueOf(123)); // Returns the string representation of the specified value
        System.out.println(String.valueOf(123).getClass());
        
        // name = name.concat(" Doe");
        // String[] words=name.split(" ");
        // for(String word:words){
        //     System.out.println(word);
        // }
    }
}
