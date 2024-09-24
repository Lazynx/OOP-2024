package lab1.task1;

public class Data {
    private double sum;
    private double max;
    private int cnt;

    Data () {

    }

    public void addNumToData(double num) {
        cnt++;
        sum += num;
        max = Math.max(max, num);
    }

    public double getAvg() {
        if (cnt > 0) return sum / cnt; else return 0;
    }

    public double getMax() {
        if (cnt > 0) return max; else return 0;
    }

    public String toString() {
        return "Average: " + getAvg() + ", Max: " + getMax();
    }
}
