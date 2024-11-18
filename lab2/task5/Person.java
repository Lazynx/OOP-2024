package lab2.task5;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public abstract class Person implements Comparable<Person>, Cloneable {
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
            assignPet(pet);
        }
    }

    public void assignPet(Animal pet) {
        if (isPetsCompatible(pet)) {
            this.pets.add(pet);
            System.out.println(pet + " has been added to " + this.name + "'s pets.");
        } else {
            System.out.println("Error: " + pet + " cannot be added because " + (pet instanceof Dog ? "dogs" : "cats") + " can't live with incompatible pets!");
        }
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

    public boolean isCatThere() {
        for (Animal pet : this.pets) {
            if (pet instanceof Cat) {
                return true;
            }
        }
        return false;
    }

    public boolean isDogThere() {
        for (Animal pet : this.pets) {
            if (pet instanceof Dog) {
                return true;
            }
        }
        return false;
    }

    public boolean isPetsCompatible(Animal pet) {
        if ((pet instanceof Dog && this.isCatThere()) || (pet instanceof Cat && this.isDogThere())) {
            System.out.println("Dogs can't live with cats, and cats can't live with dogs.");
            return false;
        }
        return true;
    }

    public void leavePetsWith(Person petTaker) {
        if (this.pets.isEmpty()) {
            System.out.println(this.name + " has no pets to leave.");
            return;
        }
        boolean isAdded = false;
        for (Animal pet : this.pets) {
            if (petTaker instanceof PhDStudent && pet instanceof Dog) {
                System.out.println("PhD students can’t take care of high-maintenance pets like dogs.");
                continue;
            }
            if (!petTaker.isPetsCompatible(pet)) {
                System.out.println(petTaker.getName() + " cannot take " + pet + " because of incompatible pets.");
                continue;
            }
            petTaker.petsForKeeping.add(pet);
            isAdded = true;
        }
        if (isAdded) {
            this.pets.clear();
            System.out.println(this.name + " has left their pets with " + petTaker.getName() + ".");
        } else {
            System.out.println("No pets were added cause they can't leave together!");
        }
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
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
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
