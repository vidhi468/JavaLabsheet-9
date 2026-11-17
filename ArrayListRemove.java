import java.util.ArrayList;
import java.util.List;

public class ArrayListRemove {
    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("C++");
        subjects.add("SQL");

        subjects.remove(1);       // Removes element at index 1.
        subjects.remove("SQL");   // Removes the matching value.
        System.out.println("After removal: " + subjects);
    }
}
