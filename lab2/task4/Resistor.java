package lab2.task4;

public class Resistor extends Circuit {
    private double resistance;
    private double potentialDifference;

    public Resistor() {}

    public Resistor(double resistance) {
        this.resistance = resistance;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
    }

    @Override
    public String toString() {
        return "Resistor [resistance: " + resistance + ", potentialDifference: " + potentialDifference + "], " + super.toString();
    }
}
