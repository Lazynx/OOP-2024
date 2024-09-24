package lab1.task4;

import practise2.Student;
import java.util.ArrayList;

public class GradeBook {
    private ArrayList<Student> students;
    private Course course;

    GradeBook () {
        this.students = new ArrayList<>();
    }

    GradeBook(ArrayList<Student> students) {
        this.students = students;
    }

    GradeBook(Course course) {
        this();
        this.course = course;
    }

    GradeBook(ArrayList<Student> students, Course course) {
        this.students = students;
        this.course = course;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getNameDescription() + "!");
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double determineClassAverage() {
        int sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return (double) sum / students.size();
    }

    public Student determineClassMin() {
        int min = Integer.MAX_VALUE;
        Student minStudent = null;
        for (Student student : students) {
            if (student.getGrade() < min) {
                min = student.getGrade();
                minStudent = student;
            }
        }
        return minStudent;
    }

    public Student determineClassMax() {
        Student maxStudent = null;
        for (Student student : students) {
            if (student.getGrade() == 100) {
                maxStudent = student;
            }
        }
        return maxStudent;
    }

    public void outputBarChart() {
        int[] grades = new int[11];
        for (Student student : students) {
            grades[student.getGrade() / 10]++;
        }
        System.out.println("Grades distribution:");
        for (int i = 0; i < grades.length; i++) {
            if (i == 10) {
                System.out.print("  100: ");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i* 10 + 9);
            }
            for (int j = 0; j < grades[i]; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public String makeOutputString() {
        if (students.isEmpty()) {
            return "No students found";
        }

        Student studentMin = determineClassMin();
        Student studentMax = determineClassMax();

        String result = "Class average is " + determineClassAverage();

        if (studentMin != null) {
            result += ". Lowest grade is " + studentMin.getGrade() + " (Student " + studentMin.getName() + ", id: " + studentMin.getId() + ").";
        } else {
            result += "No students with a minimum grade.";
        }

        if (studentMax != null) {
            result += ").\nHighest grade is 100 (Student " + studentMax.getName() + ", id: " + studentMax.getId() + ").";
        } else {
            result += "\nNo students with a maximum grade.";
        }

        return result;
    }

    public void displayGradeReport() {
        String output = makeOutputString();
        System.out.println(output);
        this.outputBarChart();
    }

    public String toString() {
        String output;
        output = makeOutputString();
        return output;
    }
}
