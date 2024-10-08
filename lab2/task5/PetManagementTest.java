package lab2.task5;

public class PetManagementTest {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer", 40000);
        Person alice = new PhDStudent("Alice", 26, new Cat("Whiskers", 3), "CS");
        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 4);

        john.assignPet(murka);
        john.assignPet(rex);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        john.leavePetsWith(alice);

        registry.printAllPeople();

        john.retrievePetsFrom(alice);

        registry.printAllPeople();
    }
}
