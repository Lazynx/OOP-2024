package lab2.task5;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public abstract class Person {
    private String name;
    private int age;
    private List<Animal> pets;
    private List<Animal> temporaryPets;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pets = new ArrayList<>();
        this.temporaryPets = new ArrayList<>();
    }

    public Person(String name, int age, Animal pet) {
        this(name, age);
        if (pet != null) {
            this.pets.add(pet);
        }
    }

    public void assignPet(Animal pet) {
        this.pets.add(pet);
    }

    public void removePet(Animal pet) {
        this.pets.remove(pet);
    }

    public boolean hasPet() {
        return !pets.isEmpty();
    }

    public String getOccupation() {
        return this.toString();
    }

    public String getName() {
        return this.name;
    }

    public void leavePetsWith(Person caretaker) {
        if (this.pets.isEmpty()) {
            System.out.println(this.name + " does not have any pets.");
            return;
        }
        for (Animal pet : this.pets) {
            if (caretaker instanceof PhDStudent && pet instanceof Dog) {
                System.out.println("PhD students can’t have high-maintenance pets like dogs.");
                continue;
            }
            caretaker.temporaryPets.add(pet);
        }
        this.pets.clear();
        System.out.println(this.name + " has left their pets with " + caretaker.getName() + ".");
    }

    public void retrievePetsFrom(Person caretaker) {
        if (caretaker.temporaryPets.isEmpty()) {
            System.out.println(caretaker.getName() + " does not have any pets to return.");
            return;
        }
        this.pets.addAll(caretaker.temporaryPets);
        caretaker.temporaryPets.clear();
        System.out.println(this.name + " has retrieved their pets from " + caretaker.getName() + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person [Name: " + name + ", Age: " + age + ", Pets: " + (pets.isEmpty() ? "No pets" : pets) + ", Temporary Pets: " + (temporaryPets.isEmpty() ? "No temporary pets" : temporaryPets) + "]";
    }
}
