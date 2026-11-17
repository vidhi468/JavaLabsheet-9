import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("Python");
        items.add("Java");
        items.add("C++");

        Set<String> uniqueItems = new LinkedHashSet<>(items);
        System.out.println("Original List: " + items);
        System.out.println("Set after duplicate removal: " + uniqueItems);
    }
}
