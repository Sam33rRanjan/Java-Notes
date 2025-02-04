class L02_Operators{
    public static void main(String[] args){
        // Arithmetic Operators
        int var1=10;
        int var2=20;
        System.out.println(var1+var2); // 30
        System.out.println(var1-var2); // -10
        System.out.println(var1*var2); // 200
        System.out.println((float)var1/var2); // 0

        // Unary Operators
        int var3=15;
        System.out.println(var3++); // 15
        System.out.println(var3); // 16
        System.out.println(++var3); // 17
        System.out.println(var3); // 17
        System.out.println(var3--); // 17
        System.out.println(var3); // 16
        System.out.println(--var3); // 15
        System.out.println(var3); // 15

        int var4=6;
        var4+=5; // var4=var4+5
        System.out.println(var4); // 11

        boolean b1=true;
        System.out.println(!b1); // false

        // Relational Operators
        System.out.println(var1>var2); // false
        System.out.println(var1<var2); // true

        boolean b2 = (var1==10) && (var2==20);
        System.out.println(b2); // true
        b2 = (var1==10) && (var2==30);
        System.out.println(b2); // false
        b2 = (var1==10) || (var2==30);
        System.out.println(b2); // true

        //Ternary Operator
        int var5 = (var1>var2)?var1:var2;
        System.out.println(var5); // 20

        // Bitwise Operators
        int var6=5; // 101
        int var7=6; // 110
        System.out.println(var6&var7); // 100
        System.out.println(var6|var7); // 111
        System.out.println(var6^var7); // 011
        System.out.println(~var6); // 11111111111111111111111111111010
    }
}