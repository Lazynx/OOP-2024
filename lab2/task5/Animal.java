package lab2.task5;

import java.util.Objects;

public abstract class Animal implements Moveable, Soundable {
    private String name;
    private int age;
    private double distance;
    private double speed;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("This animal made sound");
    }

    @Override
    public void move(double time) {
        this.distance = speed * time;
    };

    @Override
    public double getDistance() {
        return distance;
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println("Animal " + name + " stopped, it went " + distance);
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() == o.getClass()) return false;
        Animal that = (Animal) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
