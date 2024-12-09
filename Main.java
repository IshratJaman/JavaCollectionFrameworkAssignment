import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        System.out.println("List Example for ArrayList: " + fruits);


        System.out.println("Element at index 1: " + fruits.get(1));


        System.out.print("Iterating through List: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();


        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10); // Adds elements to the queue
        queue.offer(20);
        queue.offer(30);
        System.out.println("Queue Example (LinkedList): " + queue);


        System.out.println("Polling element: " + queue.poll());
        System.out.println("Queue after polling: " + queue);


        System.out.println("Peeking element: " + queue.peek());


        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Stack Example: " + stack);


        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after popping: " + stack);

        System.out.println("Top element (peek): " + stack.peek());
    }
}
