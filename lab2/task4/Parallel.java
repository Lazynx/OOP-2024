package lab2.task4;

public class Parallel extends Circuit {
    private Circuit circuit1;
    private Circuit circuit2;

    public Parallel(Circuit circuit1, Circuit circuit2) {
        this.circuit1 = circuit1;
        this.circuit2 = circuit2;
    }

    @Override
    public double getResistance() {
        double r1 = circuit1.getResistance();
        double r2 = circuit2.getResistance();
        return (r1 * r2) / (r1 + r2);
    }

    @Override
    public double getPotentialDiff() {
        return circuit1.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        circuit1.applyPotentialDiff(V);
        circuit2.applyPotentialDiff(V);
    }

    @Override
    public String toString() {
        return "Parallel [circuit1: " + circuit1 + ", circuit2: " + circuit2 + "], " + super.toString();
    }
}
