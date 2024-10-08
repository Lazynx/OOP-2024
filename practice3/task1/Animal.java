package practice3.task1;

public class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal() {}

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void voice() {
        System.out.println("Voice voice!");
    };

    public void eat() {
        System.out.println("Eat food!");
    }

    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", weight=" + weight + "]";
    }
}
