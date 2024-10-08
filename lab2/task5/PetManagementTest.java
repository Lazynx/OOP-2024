package lab2.task5;

public class PetManagementTest {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer", 40000);
        Person alice = new PhDStudent("Alice", 26, new Cat("Whiskers", 3), "CS");
        Person iluha = new Student("Iluha", 30, new Dog("SOBAKA", 3), "Engineer", 40000);
        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 4);

        System.out.println("john.assignPet(murka)");
        john.assignPet(murka);

        System.out.println("\niluha.assignPet(rex)");
        iluha.assignPet(rex);
//
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
//
        iluha.leavePetsWith(john);
//
        registry.printAllPeople();
//
        john.retrievePetsFrom(alice);
//
//        registry.printAllPeople();
    }
}
