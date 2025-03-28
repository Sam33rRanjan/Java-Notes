class L12_Student {
    int id;
    String name;
    
    // Default Constructor
    L12_Student() {
        this(0, "Default"); //constructor calling should be the first statement in the constructor
        System.out.println("Default Constructor");
    }
    // Parameterized Constructor
    L12_Student(int id, String name) {
        System.out.println("Parameterized Constructor");
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

class L12_Monitor extends L12_Student {
    String position;

    L12_Monitor(int id, String name) {
        super(id, name);
        this.position="Monitor";
    }

    void display() {
        super.display();
        System.out.println(id + " " + name + " " + position);
    }
}
public class L12_This_and_Super_Keywords {
    public static void main(String[] args) {
        L12_Student s2 = new L12_Student();
        s2.display();

        L12_Monitor c = new L12_Monitor(2, "Jane");
        c.display();
    }
}
