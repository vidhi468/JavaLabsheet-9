import java.util.ArrayList;
import java.util.List;

public class ArrayListSize {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Riya");
        names.add("Karan");
        System.out.println("Elements: " + names);
        System.out.println("Size: " + names.size());
    }
}
