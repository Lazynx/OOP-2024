package practice1;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task7 {
    public static void printCalendar(int year, int month, int highlightDay) {
        GregorianCalendar calendar = new GregorianCalendar(year, month, 1);
        int firstDayOfWeek = calendar.get(GregorianCalendar.DAY_OF_WEEK);
        int daysInMonth = calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            if (day == highlightDay) {
                System.out.printf("%2d* ", day);
            } else {
                System.out.printf("%3d ", day);
            }

            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        System.out.println("Enter the month (1-12): ");
        int month = scanner.nextInt() - 1;
        System.out.println("Enter the day to highlight: ");
        int highlightDay = scanner.nextInt();

        printCalendar(year, month, highlightDay);
    }
}
