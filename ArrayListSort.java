import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(23);

        Collections.sort(numbers);
        System.out.println("Ascending order: " + numbers);
    }
}
