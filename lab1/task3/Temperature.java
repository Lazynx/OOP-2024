package lab1.task3;

public class Temperature {
    private double temperature;
    private char scale ;

    Temperature() {
        this.temperature = 0.0;
        this.scale = 'C';
    }

    Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }

    Temperature(char scale) {
        this.temperature = 0;
        this.scale = scale;
    }

    Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public double getTemperatureC() {
        if (this.scale == 'C') {
            return this.temperature;
        }
        return 5 * (temperature - 32) / 9;
    }

    public double getTemperatureF() {
        if (this.scale == 'F') {
            return this.temperature;
        }
        return (9 * (temperature / 5)) + 32;
    }

    public char getScale() {
        return scale;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperatureScale(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public String toString() {
        return temperature + " " + scale;
    }

    public boolean equals(Temperature temperature) {
        return this.getTemperatureC() == temperature.getTemperatureC();
    }
}
