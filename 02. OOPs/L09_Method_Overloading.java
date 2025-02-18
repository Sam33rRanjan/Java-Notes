public class L09_Method_Overloading {
    static int add(int a, int b)
    {
        return a+b;
    }

    static int add(int a, int b, int c)
    {
        return a+b+c;
    }

    static double add(double a, int b)
    {
        return a+b;
    }
    
    public static void main(String[] args) {
        int sum1 = add(10, 20);
        System.out.println(sum1); // 30
        int sum2 = add(10, 20, 30);
        System.out.println(sum2); // 60
        double sum3 = add(10.5, 20);
        System.out.println(sum3); // 30.5
    }
}
