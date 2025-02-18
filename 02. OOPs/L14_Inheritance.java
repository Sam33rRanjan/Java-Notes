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

//Types of Inheritance:
// 1. Single Inheritance - A -> B
// 2. Multilevel Inheritance - A -> B -> C
// 3. Hierarchical Inheritance - A -> B, A -> C
// 4. Multiple Inheritance - A -> B, C -> B (Not supported in Java)

public class L14_Inheritance {
    public static void main(String[] args) {
        L14_Adv_Calc c = new L14_Adv_Calc();
        System.out.println(c.add(2, 3));
        System.out.println(c.sub(2, 3));
        System.out.println(c.mul(2, 3));
        System.out.println(c.div(2, 3));
    }
}
