import java.util.ArrayList;
import java.util.Iterator;
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
        return "Student{rollNumber=" + rollNumber + ", name='" + name
                + "', marks=" + marks + "}";
    }
}

public class StudentObjectList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Aarav", 86.5));
        students.add(new Student(2, "Riya", 92.0));
        students.add(new Student(3, "Kabir", 78.5));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }
}
