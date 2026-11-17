import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(100);
        queue.add(200);
        queue.add(300);
        System.out.println("After adding: " + queue);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Removed: " + queue.remove());
        System.out.println("After removing: " + queue);
        System.out.println("New head: " + queue.peek());
    }
}
