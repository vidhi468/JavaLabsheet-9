import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetToList {
    public static void main(String[] args) {
        Set<String> languages = new LinkedHashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        List<String> languageList = new ArrayList<>(languages);
        System.out.println("Converted List:");
        for (String language : languageList) {
            System.out.println(language);
        }
    }
}
