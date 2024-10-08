package lab1.task4;

import practice2.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        ArrayList<String> prerequisites = new ArrayList<String>() {{
            add("PP1");
            add("PP2");
        }};
        Course courseOOP = new Course("CS101", "Object-oriented Programming and Design", 5, prerequisites);

        GradeBook gradeBook = new GradeBook(courseOOP);
        gradeBook.displayMessage();

        System.out.println("Please, input grades for students: ");

        ArrayList<String> names = new ArrayList<String>() {{
            add("A");
            add("B");
            add("C");
            add("D");
            add("E");
            add("F");
            add("G");
            add("H");
            add("I");
            add("J");
        }};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + names.get(i) + ": ");
            String input = scanner.nextLine();
            int grade = Integer.parseInt(input);
            Student student = new Student(i, names.get(i), grade);
            gradeBook.addStudent(student);
        }
        scanner.close();

        gradeBook.displayGradeReport();
    }
}
