public class L27_Exception_Handling {
    private static void getInt(String a){
        int num = Integer.parseInt(a);
        System.out.println(num);
    }

    // Objects -> Throwable -> Exception, Error
    // Error: Errors are exceptional scenarios that are out of the scope of application and it's not possible to anticipate and recover from them, for example hardware failure, network connection failure, JVM crash, out of memory error. Caused by environment and resources and application should not try to handle them

    //Components of exception : Name of exception, Description of exception, Stack trace
    // The method where exception occurs is responsible to create exception object and hand it over to JVM
    // JVM will check if the method has provided exception handling code or not
    // If method has provided exception handling code then JVM will hand over the exception object to that code
    // If method has not provided exception handling code then JVM will terminate the method abruptly and check if the calling method has provided exception handling code or not
    // This process will continue until the exception object is handled or JVM reaches the top of the call stack(main method) and if exception object is not handled then JVM will terminate the main method abruptly
    // If the exception object is not handled then JVM will hand over the exception object to default exception handler which will print the exception information on console and terminate the program

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

        // try with multiple catch block  should be in order of child to parent class
        // we can write try without catch block but not vice versa 
        // if we don't have catch block then finally block is mandatory
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
        finally {
            System.out.println("Finally block");
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
            e.printStackTrace();
            System.out.println(e.toString());
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
        } 
        catch (Exception e) {
            return 20;
        } 
        // finally {
        //     return 30;
        // }
    }

    private static double divide(int a, int b) throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException {
        if (b == 0) {
            throw new ArithmeticException("Divisor can't be zero");
        }
        return a / b;
    }

    private static void throwException() throws L27_MyException {
        throw new L27_MyException("My custom exception");
        // Throw keyword is used to hand over the exception object to JVM manually
    }
}

// We can use "Exception e" instead of specific exception class in catch block to catch all exceptions
// We can use multiple catch blocks to handle multiple exceptions
// We can use "finally" block to execute code after try-catch block and the code in finally block will always execute
// If any method throws checked exception then it must be handled by using try-catch block or method signature must declare that it throws the exception using "throws" keyword
// Using throws keyword we declare that the method throws an exception and the caller of the method should handle the exception

// Exception methyods: getMessage() prints description of exception, printStackTrace() prints name desc and stack trace, toString() prints name and description of exception

// All exceptions are runtime exceptions
// Checked/Compiled time exceptions example: IOException, SQLException, ClassNotFoundException, InterruptedException. These exceptions must be handled else code will not compile. These exceptions are checked by compiler.
// Unchecked/Runtime exceptions example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, NumberFormatException. These exceptions are not checked by compiler and it's up to the programmer to handle them.

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