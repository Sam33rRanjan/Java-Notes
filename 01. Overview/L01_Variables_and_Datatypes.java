public class L01_Variables_and_Datatypes {
    
    int var1=10; // instance variable
    static int var2=20; // static variable
    
    public static void main(String[] args) {
        int var3=30; // local variable
        System.out.println(var3);
        
        System.out.println("Hello World");
        int num1=12; // byte 1 byte, short 2 bytes, int 4 bytes, long 8 bytes
        int num2=13; // byte -128 to 127, short -32768 to 32767, int -2^31 to 2^31-1, long -2^63 to 2^63-1
        System.out.println(num1+num2);
        long num7=123456789056485415l; // l is used to tell the compiler that it is a long type as the default type is int
        System.out.println(num7);

        float num3=12.2f;  // f is used to tell the compiler that it is a float type as the default type is double
        float num4=13.3f;  // float 4 bytes, double 8 bytes
        System.out.println(num3+num4);
        double num5=12.2;
        double num6=13.3;
        System.out.println(num5+num6);

        char ch='A'; // char 2 bytes
        System.out.println(ch);

        boolean b=true; // boolean 1 bit
        System.out.println(b);
    }
}