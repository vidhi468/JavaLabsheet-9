import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueAdd {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);

        // Printing a PriorityQueue does not guarantee sorted display order.
        System.out.println("PriorityQueue: " + numbers);
        System.out.println("Head (smallest element): " + numbers.peek());
    }
}
