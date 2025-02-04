class L05_Typecasting {
    public static void main(String[] args) {
        // Implicit Typecasting
        int a = 10;
        long b = a; // int to long
        float c = a; // int to float
        double d = a; // int to double
        double x = 10.5f; // float to double

        System.out.println("Implicit Typecasting");
        System.out.println("int to long: " + b);
        System.out.println("int to float: " + c);
        System.out.println("int to double: " + d);
        System.out.println("float to double: " + x);

        // Explicit Typecasting
        double e = 10.5;
        int f = (int) e; // double to int
        long g = (long) e; // double to long
        float h = (float) e; // double to float
        long y = (long) x; // double to long

        System.out.println("Explicit Typecasting");
        System.out.println("double to int: " + f);
        System.out.println("double to long: " + g);
        System.out.println("double to float: " + h);
        System.out.println("double to long: " + y);
    }
}