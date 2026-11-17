import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompareSets {
    public static void main(String[] args) {
        Integer[] values = {30, 10, 20, 10};

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (Integer value : values) {
            hashSet.add(value);
            linkedHashSet.add(value);
            treeSet.add(value);
        }

        System.out.println("HashSet (no guaranteed order): " + hashSet);
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
        System.out.println("TreeSet (sorted order): " + treeSet);
    }
}
