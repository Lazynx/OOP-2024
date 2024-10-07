package practise3.task1;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 23, 4);

        animal.eat();
        animal.voice();
        System.out.println(animal);

        Cat myCat = new Cat("Monya", 10, 5, "British");
        myCat.eat("Whiskas");
        myCat.voice();
        System.out.println(myCat);
    }
}
