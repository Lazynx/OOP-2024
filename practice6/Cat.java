package practice6;

public class Cat extends Animal implements CanHavePizza {
    private String breed;

    public Cat () {}

    public Cat (String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void eatPizza() {
        System.out.println("Cat has eaten pizza");
    };

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return true;
        Cat cat = (Cat) o;
        return breed.equals(cat.getBreed());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + breed.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Cat [breed=" + breed + "], " + super.toString();
    }
}
