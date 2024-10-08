package lab2.task5;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public abstract class Person {
    private String name;
    private int age;
    private List<Animal> pets;
    private List<Animal> petsForKeeping;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pets = new ArrayList<>();
        this.petsForKeeping = new ArrayList<>();
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

    public void leavePetsWith(Person petTaker) {
        if (this.pets.isEmpty()) {
            System.out.println(this.name + " has no pets for leaving.");
            return;
        }
        for (Animal pet : this.pets) {
            if (petTaker instanceof PhDStudent && pet instanceof Dog) {
                System.out.println("PhD students can’t have high-maintenance pets like dogs.");
                continue;
            }
            petTaker.petsForKeeping.add(pet);
        }
        this.pets.clear();
        System.out.println(this.name + " has left their pets with " + petTaker.getName() + ".");
    }

    public void retrievePetsFrom(Person petTaker) {
        if (petTaker.petsForKeeping.isEmpty()) {
            System.out.println(petTaker.getName() + " has no pets for retrieving.");
            return;
        }
        this.pets.addAll(petTaker.petsForKeeping);
        petTaker.petsForKeeping.clear();
        System.out.println(this.name + " has retrieved their pets from " + petTaker.getName() + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(pets, that.pets) && Objects.equals(petsForKeeping, that.petsForKeeping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person [Name: " + name + ", Age: " + age + ", Pets: " + (pets.isEmpty() ? "No pets" : pets) + ", Temporary Pets: " + (petsForKeeping.isEmpty() ? "No temporary pets" : petsForKeeping) + "]";
    }
}
