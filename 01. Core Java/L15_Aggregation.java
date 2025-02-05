class L15_Address {
    String street, city, country;

    L15_Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }
}

// Aggregation is a HAS-A relationship
class L15_Employee {
    int id;
    String name;
    L15_Address address;

    L15_Employee(int id, String name, L15_Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.print(id + ", " + name + ", ");
        System.out.println(address.street + " " + address.city + ", " + address.country);
    }
}

public class L15_Aggregation {
    public static void main(String[] args) {
        L15_Address a1 = new L15_Address("123", "Delhi", "India");
        L15_Address a2 = new L15_Address("456", "Mumbai", "India");

        L15_Employee e1 = new L15_Employee(111, "Varun", a1);
        L15_Employee e2 = new L15_Employee(222, "Rohan", a2);

        e1.display();
        e2.display();
    }
}
