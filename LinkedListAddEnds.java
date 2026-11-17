import java.util.LinkedList;

public class LinkedListAddEnds {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Study");
        tasks.addFirst("Wake up");
        tasks.addLast("Sleep");
        System.out.println("Updated LinkedList: " + tasks);
    }
}
