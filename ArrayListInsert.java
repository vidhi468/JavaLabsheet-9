import java.util.ArrayList;
import java.util.List;

public class ArrayListInsert {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add(1, "Orange");
        System.out.println("After insertion: " + fruits);
    }
}
