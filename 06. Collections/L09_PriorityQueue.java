import java.util.*;

public class L09_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        // queue.add(10);
        // queue.add(20);
        // queue.add(15);
        // queue.add(5);
        // queue.add(25);
        queue.add(4);
        queue.add(2);
        queue.add(1);
        queue.add(3);
        // queue.add(null); // NullPointerException

        System.out.println("PriorityQueue: " + queue);

        System.out.println("Head: " + queue.peek());

        Iterator<Integer> itr = queue.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        queue.poll();
        System.out.println("PriorityQueue after removing head: " + queue);
        queue.remove();
        System.out.println("PriorityQueue after removing head: " + queue);
        queue.remove(3);
        System.out.println("PriorityQueue after removing 3: " + queue);

        queue.clear();
        System.out.println("PriorityQueue after clearing: " + queue);
    }
}

// Priority queue can't have null values.
// It follows a priority heap data structure.
// It is non-synchronized.
// It implements the queue interface.