import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class All_Comparator_methods {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 20));
        students.add(new Student(2, "Bob", 22));
        students.add(new Student(3, "Charlie", 19));
        students.add(new Student(4, "David", 25));

        System.out.println("Original List:");
        printStudents(students);

        // Sorting by ID using a custom Comparator
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.id - s2.id;
            }
        });
        System.out.println("Sorted by ID:");
        printStudents(students);

        // Sorting by name using a lambda expression
        Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("Sorted by Name:");
        printStudents(students);

        // Sorting by age using a method reference
        Collections.sort(students, Comparator.comparingInt(s -> s.age));
        System.out.println("Sorted by Age:");
        printStudents(students);
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println("ID: " + student.id + ", Name: " + student.name + ", Age: " + student.age);
        }
        System.out.println();
    }
}
