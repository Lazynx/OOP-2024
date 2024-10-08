package lab2.task5;

public class Employee extends Person {
    private String profession;
    private int salary;

    public Employee(String name, int age, Animal pet, String profession, int salary) {
        super(name, age, pet);
        this.profession = profession;
        this.salary = salary;
    }

    public Employee(String name, int age, String profession, int salary) {
        super(name, age);
        this.profession = profession;
        this.salary = salary;
    }

    @Override
    public String getOccupation() {
        return toString();
    }

    @Override
    public String toString() {
        return "Employee [profession: " + profession + ", salary: " + salary + "], " + super.toString();
    }
}
