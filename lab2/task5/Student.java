package lab2.task5;

public class Student extends Person {
    private String university;
    private int course;

    public Student(String name, int age, String university, int course) {
        super(name, age);
        this.university = university;
        this.course = course;
    }

    public Student(String name, int age, Animal pet, String university, int course) {
        super(name, age, pet);
        this.university = university;
        this.course = course;
    }

    @Override
    public String getOccupation() {
        return toString();
    }

    @Override
    public String toString() {
        return "Student [university: " + university + ", course: " + course + "], " + super.toString();
    }
}
