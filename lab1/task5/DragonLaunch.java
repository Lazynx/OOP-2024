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
        int k = 0;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getGender() == Gender.B) {
                k++;
            } else {
                k--;
            }
            if (k < 0) {
                return true;
            }
        }
        return k!=0;
    }

    public String toString() {
        if (willDragonEatOrNot()) {
            return "Dragon Eat";
        } else return "Dragon Not Eat";
    }
}
