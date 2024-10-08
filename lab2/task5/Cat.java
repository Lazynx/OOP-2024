package lab2.task5;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "MEOW MEOW MEOW MEOW MEOW";
    }
}
