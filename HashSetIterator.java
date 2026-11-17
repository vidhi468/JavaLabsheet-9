import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterator {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
