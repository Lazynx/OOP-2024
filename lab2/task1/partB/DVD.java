package lab2.task1.partB;

public class DVD extends LibraryItem {
    private int numberOfSeries;

    public DVD() {}

    public DVD(String title, String author, int year, int numberOfSeries) {
        super(title, author, year);
        this.numberOfSeries = numberOfSeries;
    }

    public int getNumberOfSeries() {
        return numberOfSeries;
    }

    public void setNumberOfSeries(int numberOfSeries) {
        this.numberOfSeries = numberOfSeries;
    }

    public void numberOfSeriesInfo() {
        if (numberOfSeries != 0) {
            System.out.println("This DVD - " + getTitle() + " has " + numberOfSeries + " series");
        } else {
            System.out.println("This DVD - " + getTitle() + " has no series for now");
        }
    }

    @Override
    public String toString() {
        return "DVD " + super.toString() + ", [number of series: " + numberOfSeries + "]";
    }
}
