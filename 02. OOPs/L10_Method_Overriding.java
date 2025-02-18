class L10_Animal {
    void sound() {
        System.out.println("Animal is making a sound!");
    }
}

class L10_Dog extends L10_Animal {
    void sound() {
        System.out.println("Dog is barking!");
    }
}

public class L10_Method_Overriding {
    public static void main(String[] args) {
        L10_Animal a = new L10_Animal();
        a.sound(); // Animal is making a sound
        L10_Dog d = new L10_Dog();
        d.sound(); // Dog is barking
    }
}
