import java.util.HashSet;
import java.util.Set;

public class HashSetDuplicates {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // Duplicate is ignored.
        numbers.add(30);

        System.out.println("HashSet: " + numbers);
        System.out.println("Size (duplicates are not counted): " + numbers.size());
    }
}
