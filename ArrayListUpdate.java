import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdate {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.set(1, "Yellow");
        System.out.println("Updated list: " + colors);
    }
}
