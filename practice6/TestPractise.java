package practice6;

public class TestPractise {
    public static void main(String[] args) {
        Cat myCat = new Cat("Monya", 12, "smooth");
        Student myStudent = new Student("Ilya", 19, 999);
        Restaurant myRestaurant = new Restaurant(1000);

        myRestaurant.servePizza(myCat);
        myRestaurant.servePizza(myStudent);
    }
}
