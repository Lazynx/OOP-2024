package lab2.task4;

public abstract class Circuit {
    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double V);

    public double getPower() {
        return (getCurrent() * getCurrent()) / getResistance();
    }

    public double getCurrent() {
        return getPotentialDiff() / getResistance();
    }

    @Override
    public String toString() {
        return "Circuit [current: " + getCurrent() + ", resistance: " + getResistance() + ", power: " + getPower() + "]";
    }
}
