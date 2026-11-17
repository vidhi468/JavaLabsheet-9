import java.util.TreeSet;

public class TreeSetContains {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int searchValue = 20;
        System.out.println("Contains " + searchValue + "? "
                + numbers.contains(searchValue));
    }
}
