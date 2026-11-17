import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Haridwar");
        cities.add("Roorkee");
        cities.add("Dehradun");

        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
