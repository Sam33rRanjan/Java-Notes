public class L20_Wrapper_Class {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        Integer num6= Integer.valueOf(num1); // Boxing or Wrapping
        System.out.println(num6);
        System.out.println(num6.getClass());
        Integer num2 = num1; // Auto-Boxing
        System.out.println(num2);
        int num3 = num2.intValue(); // Unboxing or Unwrapping
        System.out.println(num3);
        int num4 = num2; // Auto-unboxing
        System.out.println(num4);

        String str = "123";
        int num5 = Integer.parseInt(str);
        System.out.println(num5*2);
    }
}

// Wrapper classes are used to convert primitive data types into objects
// The process of converting primitive data types into objects is called boxing
// The process of converting objects into primitive data types is called unboxing
// The classes in Java that represent primitive data types are called wrapper classes
// The wrapper classes are Byte, Short, Integer, Long, Float, Double, Character, Boolean