class L14_Calc {
    int add(int a, int b) {
        return a + b;
    }
    int sub(int a, int b) {
        return a - b;
    }
}

// Inheritance is an IS-A relationship
class L14_Adv_Calc extends L14_Calc {
    int mul(int a, int b) {
        return a * b;
    }
    double div(int a, int b) {
        return (double)a / b;
    }
}

public class L14_Inheritance {
    public static void main(String[] args) {
        L14_Adv_Calc c = new L14_Adv_Calc();
        System.out.println(c.add(2, 3));
        System.out.println(c.sub(2, 3));
        System.out.println(c.mul(2, 3));
        System.out.println(c.div(2, 3));
    }
}
