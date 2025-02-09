public class L27_Exception_Handling {
    private static void getInt(String a){
        int num = Integer.parseInt(a);
        System.out.println(num);
    }

    public static void main(String[] args) {        
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }

        try {
            int arr[] = new int[5];
            arr[10] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        }

        try {
            getInt("ten");
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }

        try {
            // String str = null;
            String str = "hello";
            int num=0;
            System.out.println(str.length()/num);
        } 
        catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }
        catch (Exception e) {
            System.out.println("Other exception");
        }

        try {
            // String str = null;
            String str = "hello";
            int num=0;
            System.out.println(str.length()/num);
        } 
        catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null pointer or arithmetic exception");
        }
        finally {
            System.out.println("Finally block");
        }

        System.out.println(printNum()); // printNum will always return 30 as return statement in finally block will override the return statement in try/catch block
        
        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            throwException();
        } catch (L27_MyException e) {
            System.out.println(e);
        }
    }

    private static int printNum(){
        try {
            return 10;
        } catch (Exception e) {
            return 20;
        } finally {
            return 30;
        }
    }

    private static double divide(int a, int b) throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        return a / b;
    }

    private static void throwException() throws L27_MyException {
        throw new L27_MyException("My custom exception");
    }
}


// We can use "Exception e" instead of specific exception class in catch block to catch all exceptions
// We can use multiple catch blocks to handle multiple exceptions
// We can use "finally" block to execute code after try-catch block and the code in finally block will always execute
// If any method throws compile time exception then it must be handled by using try-catch block or method signature must declare that it throws the exception using "throws" keyword

// Checked/Compiled time exceptions example: IOException, SQLException
// Unchecked/Runtime exceptions example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, NumberFormatException

class L27_MyException extends Exception {
    String str;
    L27_MyException(String s) {
        str = s;
    }

    public String toString() {
        return ("Output string: " + str);
    }
}

// Custom exception class must extend Throwable class or any of its subclasses