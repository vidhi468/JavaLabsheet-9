import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueRemove {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Removal order:");
        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }
    }
}
