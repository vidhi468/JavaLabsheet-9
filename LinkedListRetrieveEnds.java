import java.util.LinkedList;

public class LinkedListRetrieveEnds {
    public static void main(String[] args) {
        LinkedList<Integer> values = new LinkedList<>();
        values.add(100);
        values.add(200);
        values.add(300);

        System.out.println("First element: " + values.getFirst());
        System.out.println("Last element: " + values.getLast());
    }
}
