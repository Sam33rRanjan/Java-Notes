import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class L08_Cursors {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(true);
        vector.addElement(30);
        vector.addElement(40);
        vector.add(3,25);

        System.out.println("Vector: " + vector);

        Enumeration e = vector.elements();
        while(e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();

        Iterator itr = vector.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        ListIterator litr = vector.listIterator();
        while(litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }
        System.out.println();

        ListIterator litr1 = vector.listIterator(vector.size());
        while(litr1.hasPrevious()) {
            System.out.print(litr1.previous() + " ");
        }
        System.out.println();
    }
}

// Cursors are used to retrieve data from collections. There are three types of cursors in Java:
// 1. Enumeration : It is used to get elements one by one from legacy classes like Vector, Stack, HashTable and Properties.
// 2. Iterator : It is used to get elements one by one from all collections. We can move in forward direction only.
// 3. ListIterator : It is used to get elements one by one from List implemented classes like ArrayList, LinkedList, Vector and Stack. We can move in forward and backward directions.
