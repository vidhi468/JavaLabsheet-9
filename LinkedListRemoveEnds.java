import java.util.LinkedList;

public class LinkedListRemoveEnds {
    public static void main(String[] args) {
        LinkedList<String> days = new LinkedList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");

        days.removeFirst();
        days.removeLast();
        System.out.println("After removing first and last: " + days);
    }
}
