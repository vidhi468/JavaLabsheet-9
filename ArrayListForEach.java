import java.util.ArrayList;
import java.util.List;

public class ArrayListForEach {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(75);
        marks.add(82);
        marks.add(91);

        for (Integer mark : marks) {
            System.out.println(mark);
        }
    }
}
