import java.util.Scanner;

public class L28_Chained_Exceptions {
    static void exc(){
        NullPointerException e = new NullPointerException("top layer");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }
    
    public static void main(String[] args) {
        try {
            exc();
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e);
            System.out.println("Original cause: " + e.getCause());
        }
        
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("Number: " + num);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

// If we allocate a resource in try() block, it will be automatically closed after the try block ends (even if an exception is thrown) without using finally block
