package lab2.task5;

public class PhDStudent extends Person {
    private String faculty;

    public PhDStudent(String name, int age, String faculty) {
        super(name, age);
        this.faculty = faculty;
    }

    public PhDStudent(String name, int age, Animal pet, String faculty) {
        super(name, age, pet instanceof Dog ? null : pet);
        this.faculty = faculty;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("Error, PhDStudent can't have a dog. PhD students are so consumed\n" +
                    "with their research that they can’t have high-maintenance pets like\n" +
                    "dogs");
        } else {
            super.assignPet(pet);
        }
    }

    @Override
    public String getOccupation() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "PhDStudent [faculty: " + faculty + "], " + super.toString();
    }
}
