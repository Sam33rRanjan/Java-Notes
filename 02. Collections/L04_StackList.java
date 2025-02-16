import java.util.*;

public class L04_StackList {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.add(3,25);
        System.out.println("Stack: " + stack);

        System.out.println("Element at the top of the stack: " + stack.peek());

        stack.pop();
        System.out.println("Stack after popping: " + stack);

        System.out.println("If stack is empty: " + stack.empty());

        System.out.println("Index of 30: " + stack.search(30));

        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}

// Stack is synchronized.
