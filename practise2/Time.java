package practise2;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 24) {
            this.hour = hour;
        } else {
            System.out.println("Hours can't be more than 24 or negative \n");
        }
        if (minute >= 0 && minute <= 60) {
            this.minute = minute;
        } else {
            System.out.println("Minutes can't be more than 60 or negative \n");
        }
        if (second >= 0 && second <= 60) {
            this.second = second;
        } else {
            System.out.println("Seconds can't be more than 60 or negative \n");
        }
    }

    public String toUniversal() {
        return hour + ":" + minute + ":" + second;
    }

    public String toStandard() {
        String period = (hour >= 12) ? "PM" : "AM";
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        return standardHour + ":" + minute + ":" + second + " " + period;
    }

    public void add(Time time) {
        this.hour += time.hour;
        this.minute += time.minute;
        this.second += time.second;
        if (this.second > 60) {
            this.second -= 60;
            this.minute++;
        }
        if (this.minute > 60) {
            this.minute -= 60;
            this.hour++;
        }
        if (this.hour > 24) {
            this.hour -= 24;
        }
    }
}
