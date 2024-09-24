package practise2;

public class Student {
    String name;
    int id;
    int yearOfStudy;
    int grade;

    public Student() {

    }

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Student(String name, int yearOfStudy) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.grade = 0;
    }

    public Student(String name, int yearOfStudy, int grade) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public int incrementYearOfStudy() {
        yearOfStudy++;
        return yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Name - " + name + ", ID - " + id + ", Grade - " + grade;
    }
}
