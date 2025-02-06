class L16_Student {
    private String name;

    public void setName(String name) {
        this.name = "My name is " + name;
    }

    public String getName() {
        return name;
    }
}

public class L16_Encapsulation {
    public static void main(String[] args) {
        L16_Student s = new L16_Student();
        s.setName("Varun");
        System.out.println(s.getName());
    }
}
