public class L20_Wrapper_Class {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        Integer num2 = num1; // Auto-Boxing or Wrapping
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
