class L11_Student {
    int id;
    String name;

    // Default Constructor
    L11_Student() {
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    L11_Student(int i, String n) {
        id = i;
        name = n;
    }

    // Copy Constructor
    L11_Student(L11_Student s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class L11_Constructors {
    public static void main(String[] args) {
        L11_Student s1 = new L11_Student();
        s1.display();

        L11_Student s2 = new L11_Student(1, "John");
        s2.display();

        L11_Student s3 = new L11_Student(s2);
        s3.display();

        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
