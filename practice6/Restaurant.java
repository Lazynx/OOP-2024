package practice6;

public class Restaurant {
    private double budget;

    public Restaurant() {}

    public Restaurant(double budget) {
        this.budget = budget;
    }

    void servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (eater instanceof Student) {
            budget += 100;
            System.out.println("Pizza was eaten, budget: " + budget);
        }
    }

    @Override
    public String toString() {
        return "Restaurant [budget=" + budget + "]";
    }
}
