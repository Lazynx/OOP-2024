package lab2.task4;

public class Series extends Circuit {
    private Circuit circuit1;
    private Circuit circuit2;

    public Series(Circuit circuit1, Circuit circuit2) {
        this.circuit1 = circuit1;
        this.circuit2 = circuit2;
    }

    @Override
    public double getResistance() {
        return circuit1.getResistance() + circuit2.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return circuit1.getPotentialDiff() + circuit2.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        double resistance = this.getResistance();
        circuit1.applyPotentialDiff(V * (circuit1.getResistance() / resistance));
        circuit2.applyPotentialDiff(V * (circuit2.getResistance() / resistance));
    }

    @Override
    public String toString() {
        return "Series [circuit1=" + circuit1.toString() + ", circuit2=" + circuit2.toString() + "], " + super.toString();
    }
}
