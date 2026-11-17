import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class ClearCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);

        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");

        System.out.println("Before clear:");
        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Queue: " + queue);

        list.clear();
        set.clear();
        queue.clear();

        System.out.println("\\nAfter clear:");
        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Queue: " + queue);
    }
}
