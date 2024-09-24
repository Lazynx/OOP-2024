package lab1.task5;

import java.util.Vector;

public class DragonLaunchTest {
    public static void main(String[] args) {
        Vector<Person> people = new Vector<>();

        DragonLaunch dragonLaunch = new DragonLaunch(people);

        dragonLaunch.kidnap(new Person("Person1", Gender.B));
        dragonLaunch.kidnap(new Person("Person2", Gender.B));
        dragonLaunch.kidnap(new Person("Person3", Gender.G));
        dragonLaunch.kidnap(new Person("Person4", Gender.G));

        boolean result = dragonLaunch.willDragonEatOrNot();

        if (result) {
            System.out.println("The dragon will have lunch.");
        } else {
            System.out.println("No one is left for the dragon to eat.");
        }

        Vector<Person> people2 = new Vector<>();
        DragonLaunch dragonLaunch2 = new DragonLaunch(people2);

        dragonLaunch2.kidnap(new Person("Person5", Gender.G));
        dragonLaunch2.kidnap(new Person("Person6", Gender.B));
        dragonLaunch2.kidnap(new Person("Person7", Gender.G));
        dragonLaunch2.kidnap(new Person("Person8", Gender.B));

        boolean result2 = dragonLaunch2.willDragonEatOrNot();

        if (result2) {
            System.out.println("The dragon will have lunch.");
        } else {
            System.out.println("No one is left for the dragon to eat.");
        }
    }
}
