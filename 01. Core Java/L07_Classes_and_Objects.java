class L07_Person {
    // By default the attributes of the class are public
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class L07_Classes_and_Objects {
    public static void main(String[] args) {
        // Creating an object of class 'Person'
        L07_Person person1 = new L07_Person();
        person1.name = "John";
        person1.age = 25;
        person1.display();

        // Creating another object of class 'Person'
        L07_Person person2 = new L07_Person();
        person2.name = "Jane";
        person2.age = 30;
        person2.display();
    }
}

class L07_vehicle {
    private double fuel;
    private double speed;
    private int year;
    private String name;

    double getFuel() {
        return fuel;
    }
    double getSpeed() {
        return speed;
    }
    int getYear() {
        return year;
    }
    String getName() {
        return name;
    }

    void setFuel(double fuel) {
        this.fuel = fuel;
    }
    void setSpeed(double speed) {
        this.speed = speed;
    }
    void setYear(int year) {
        this.year = year;
    }
    void setName(String name) {
        this.name = name;
    }
}