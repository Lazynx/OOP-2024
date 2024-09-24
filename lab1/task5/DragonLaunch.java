package lab1.task5;

import java.util.Vector;

public class DragonLaunch {
    Vector<Person> persons;

    DragonLaunch() {}

    DragonLaunch(Vector<Person> persons) {
        this.persons = persons;
    }

    public void kidnap(Person person) {
        persons.add(person);
    }

    public boolean willDragonEatOrNot() {
        int kidnapped = 0;
        for (int i = 0; i < persons.size(); i++) {
            if (kidnapped > 0 && persons.get(kidnapped - 1).getGender() == Gender.B && persons.get(i).getGender() == Gender.G) {
                kidnapped--;
            } else {
                persons.set(kidnapped, persons.get(i));
                kidnapped++;
            }
        }
        return kidnapped > 0;
    }

    public String toString() {
        if (willDragonEatOrNot()) {
            return "Dragon Eat";
        } else return "Dragon Not Eat";
    }
}
