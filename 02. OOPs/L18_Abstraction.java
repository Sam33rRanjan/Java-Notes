abstract class L18_User {
    abstract void insertCard(); 
    // Abstract method has no body and it is declared with the abstract keyword
    // Abstract method can only be used in an abstract class
    // Abstract class can have abstract and non-abstract methods
    // Abstract can be used only for classes, methods, interfaces, inner classes and not for variables

    void display() {
        System.out.println("Welcome to the ATM");
    }
}

class L18_SBI extends L18_User {
    // Child class of abstract class must implement all the abstract methods of the parent class
    void insertCard() {
        System.out.println("Insert SBI card");
    }
}

public class L18_Abstraction {
    // Abstraction is a process of hiding the implementation details and showing only functionality to the user
    // Advantages of Abstraction:
    // 1. It provides security of the data
    // 2. Enhancemnent of the application i.e. chnages can be made easily in background withour affecting the user
    // 3. It reduces the complexity of the application by hiding unnecessary details from the user
    // Abstraction can be achieved by:
    // 1. Abstract class (0 to 100%)
    // 2. Interface (100%)

    public static void main(String[] args) {
        // L18_User u = new L18_User(); //creating object of abstract class is not allowed
        L18_User u = new L18_SBI();
        u.insertCard();
        u.display();
    }
}