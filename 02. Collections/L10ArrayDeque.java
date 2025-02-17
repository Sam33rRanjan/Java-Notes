import java.util.*;

public class L10ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(30);
        deque.add(10);
        deque.add(20);
        deque.addFirst(40);
        deque.addLast(50);
        // deque.add(null); // NullPointerException
        deque.add(60);
        deque.add(70);
        deque.add(80);

        System.out.println("ArrayDeque: " + deque);

        Iterator<Integer> itr = deque.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.println("Head: " + deque.peek());
        System.out.println("Tail: " + deque.peekLast());

        deque.poll();
        System.out.println("ArrayDeque after removing head: " + deque);
        deque.pollLast();
        System.out.println("ArrayDeque after removing tail: " + deque);
        deque.remove(20);
        System.out.println("ArrayDeque after removing 20: " + deque);
        deque.removeFirst();
        System.out.println("ArrayDeque after removing first element: " + deque);
        deque.removeLast();
        System.out.println("ArrayDeque after removing last element: " + deque);
        deque.remove();
        System.out.println("ArrayDeque after removing head: " + deque);
        deque.pop();
        System.out.println("ArrayDeque after removing head: " + deque);

        deque.clear();
        System.out.println("ArrayDeque after clearing: " + deque);
    }
}

// Array deque follows a double-ended queue data structure.
// It implements the deque interface.
// It can't have null values.
// It is non-synchronized.
