import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverse {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        Collections.reverse(languages);
        System.out.println("Reversed list: " + languages);
    }
}
