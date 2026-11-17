import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetOrder {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Vidhi");
        names.add("Aarav");
        names.add("Riya");
        names.add("Vidhi"); // Duplicate is ignored; original position remains.

        System.out.println("Insertion order: " + names);
    }
}
