import java.util.HashSet;
import java.util.Set;

public class HashSetRemove {
    public static void main(String[] args) {
        Set<String> subjects = new HashSet<>();
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("DBMS");

        subjects.remove("Python");
        System.out.println("After removal: " + subjects);
    }
}
