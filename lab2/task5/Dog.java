package lab2.task5;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "WOOF WOOF WOOF WOOF WOOF WOOF";
    }
}
