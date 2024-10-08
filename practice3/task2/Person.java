package practice3.task2;

public class Person {
    private String name;
    private String address;

    Person() {

    }

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }
}
