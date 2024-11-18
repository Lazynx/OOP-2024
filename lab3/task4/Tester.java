package lab3.task4;

import java.util.Date;
import java.util.Vector;

public class Tester {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ilya", 50000, new Date(), "INS12345");
        Employee emp2 = new Employee("Aruzhan", 60000, new Date(), "INS54321");
        Employee emp3 = new Employee("Vlad", 50000, new Date(), "INS67890");

        System.out.println("=== Employee Testing ===");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println("Are emp1 and emp2 equal? " + emp1.equals(emp2));

        System.out.println("Comparison (emp1 vs emp2): " + emp1.compareTo(emp2));
        System.out.println("Comparison (emp1 vs emp3): " + emp1.compareTo(emp3));

        try {
            Employee emp1Clone = (Employee) emp1.clone();
            System.out.println("Clone of emp1: " + emp1Clone);
        } catch (CloneNotSupportedException e) {
            System.err.println("Cloning failed: " + e.getMessage());
        }

        Vector<Employee> team = new Vector<>();
        team.add(emp1);
        team.add(emp2);

        Manager mgr1 = new Manager("Ernur", 80000, new Date(), "INS98765", 10000.0, team);
        Manager mgr2 = new Manager("Tamirlan", 80000, new Date(), "INS56789", 15000.0, team);

        System.out.println("\n=== Manager Testing ===");
        System.out.println(mgr1);
        System.out.println(mgr2);
        System.out.println("Are mgr1 and mgr2 equal? " + mgr1.equals(mgr2));

        System.out.println("Comparison (mgr1 vs mgr2): " + mgr1.compareTo(mgr2));

        try {
            Manager mgr1Clone = (Manager) mgr1.clone();
            System.out.println("Clone of mgr1: " + mgr1Clone);
        } catch (CloneNotSupportedException e) {
            System.err.println("Cloning failed: " + e.getMessage());
        }

        System.out.println("\n=== Comparator Testing ===");

        Comparator<Person> nameComparator = new PersonComparator();
        System.out.println("Name comparison (per1 vs per2): " + nameComparator.compare(emp1, emp2));

        Comparator<Employee> hireDateComparator = new EmployeeComparator();
        System.out.println("Hire date comparison (emp1 vs emp2): " + hireDateComparator.compare(emp1, emp2));

        System.out.println("\nManager's Team:");
        mgr1.getTeam().forEach(System.out::println);
    }
}
