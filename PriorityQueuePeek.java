import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePeek {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(25);
        numbers.add(5);
        numbers.add(15);

        System.out.println("Head element: " + numbers.peek());
        System.out.println("Queue after peek: " + numbers);
        System.out.println("Size remains: " + numbers.size());
    }
}
