package lab2.task5;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getSound() {
        return "Sound";
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }
}
