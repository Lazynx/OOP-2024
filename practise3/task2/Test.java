package practise3.task2;

import java.util.Scanner;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<Person> people = new Vector<>();

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Options:\nAdd - Add a new person\nExit - To exit from program\n" +
                    "Print - To print all the people");
            String input = in.nextLine().toLowerCase();

            switch (input) {
                case "exit":
                    System.out.println("Exiting program....");
                    in.close();
                    return;
                case "add":
                    addPerson(in, people);
                    break;
                case "print":
                    printPeople(people);
                    break;
                default:
                    System.out.println("Invalid input! Try again!");
            }
        }
    }

    public static void addPerson(Scanner in, Vector<Person> people) {
        System.out.println("Choose whom you want to add: \n" +
                "1 - Person(name, address)\n" +
                "2 - Student(name, address, program, year, fee)\n" +
                "3 - Staff(name, address, school, pay)");
        String choice = in.nextLine();

        switch (choice) {
            case "1": {
                System.out.println("Input params (name, address) separated by |. For example Ilya | Microdistrict 7, 11");
                String[] params = in.nextLine().split("\\|");
                if (params.length == 2) {
                    Person p1 = new Person(params[0].trim(), params[1].trim());
                    people.add(p1);
                    System.out.println("Person was added successfully");
                } else {
                    System.out.println("Invalid input format. Please use the format: name | address");
                }
                break;
            }
            case "2": {
                System.out.println("Input params (name, address, program, year, fee) separated by |. " +
                        "For example: Alex | Microdistrict 7, 22 | Computer Science | 2 | 1500");
                String[] params = in.nextLine().split("\\|");
                if (params.length == 5) {
                    Student s1 = new Student(params[0].trim(), params[1].trim(), params[2].trim(),
                            Integer.parseInt(params[3].trim()), Double.parseDouble(params[4].trim()));
                    people.add(s1);
                    System.out.println("Student was added successfully");
                } else {
                    System.out.println("Invalid input format. Please use the format: name | address | program | year | fee");
                }
                break;
            }
            case "3": {
                System.out.println("Input params (name, address, school, pay) separated by |. " +
                        "For example: Olga | Microdistrict 7, 11 | School 12 | 2000");
                String[] params = in.nextLine().split("\\|");
                if (params.length == 4) {
                    Staff staff1 = new Staff(params[0].trim(), params[1].trim(), params[2].trim(),
                            Double.parseDouble(params[3].trim()));
                    people.add(staff1);
                    System.out.println("Staff was added successfully");
                } else {
                    System.out.println("Invalid input format. Please use the format: name | address | school | pay");
                }
                break;
            }
            default:
                System.out.println("Invalid choice! Please choose 1, 2, or 3.");
        }
    }

    public static void printPeople(Vector<Person> people) {
        if (people.isEmpty()) {
            System.out.println("No people added.");
        } else {
            System.out.println("Printing all people:");
            for (Person person : people) {
                System.out.println(person);
                if (person instanceof Staff) {
                    System.out.println(((Staff) person).getSchool());
                }
            }
        }
    }
}
