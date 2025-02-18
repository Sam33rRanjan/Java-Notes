final class L25_MyImmutable_Class {
    private int id;
    public L25_MyImmutable_Class(int id) {
        this.id = id;
    }

    public L25_MyImmutable_Class modify(int id) {
        if (this.id == id) {
            return this;
        } else {
            return (new L25_MyImmutable_Class(id));
        }
    }
}


public class L25_Immutable_Class {
    public static void main(String[] args) {
        L25_MyImmutable_Class obj1 = new L25_MyImmutable_Class(10);
        L25_MyImmutable_Class obj2 = obj1.modify(100);
        L25_MyImmutable_Class obj3 = obj1.modify(10);

        System.out.println(obj1 == obj2); // false
        System.out.println(obj1 == obj3); // true
    }
}