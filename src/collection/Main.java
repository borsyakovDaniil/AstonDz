package collection;


import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();
        students.add(new Student("Алиса", 1, 2, 5));
        students.add(new Student("Дима", 9, 5, 3));
        students.add(new Student("Мария", 1, 3, 1));

        printByCourse(students,5);
        students.removeIf(student -> student.getEstimation() < 3);
        students.forEach(Student::promote);
    }

    public static void printByCourse(Set<Student> students, int number) {
        for (Student s : students) {
            if (s.getCourse() == number) {
                System.out.println(s.getName());
            }
        }
    }
}
