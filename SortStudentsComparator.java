import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private final int rollNumber;
    private final String name;
    private final double marks;

    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNumber() { return rollNumber; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    @Override
    public String toString() {
        return rollNumber + " - " + name + " - " + marks;
    }
}

public class SortStudentsComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Aarav", 76.5));
        students.add(new Student(2, "Riya", 92.0));
        students.add(new Student(3, "Kabir", 84.0));

        // Sort students by marks in ascending order.
        students.sort(Comparator.comparingDouble(Student::getMarks));

        System.out.println("Students sorted by marks:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
