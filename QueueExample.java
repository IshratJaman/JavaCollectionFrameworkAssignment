import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        // Queue Example
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Queue: " + queue);
        System.out.println("Poll: " + queue.poll());

        // DeQueue Example
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(40);
        deque.offerLast(50);
        System.out.println("Deque: " + deque);
    }
}
