package lab3.task5;

public class Chocolate implements Comparable<Chocolate> {
    private String name;
    private int weight;

    public Chocolate() {}

    public Chocolate(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Chocolate otherChocolate) {
        return Integer.compare(this.getWeight(), otherChocolate.getWeight());
    }

    @Override
    public String toString() {
        return "Chocolate [name=" + name + ", weight=" + weight + "]";
    }
}
