package practice3.task1;

public class Cat extends Animal {
    private String breed;

    public Cat() {
        super();
    }

    public Cat(String name, int age, int weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    private String getBreed() {
        return breed;
    }

    public void voice() {
        System.out.println("Meow meow meow meow meow!");
    }

    public void eat(String food) {
        System.out.println("Eat " + food + "!");
    }

    public String toString() {
        return "Cat with breed: " + breed + " - " + super.toString();
    }
}
