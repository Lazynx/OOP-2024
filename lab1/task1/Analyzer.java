package lab1.task1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Data d = new Data();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number (Q to quit): ");

            String temp = in.nextLine();

            if (temp.equalsIgnoreCase("q")) {
                break;
            }

            if (!isNumeric(temp)) {
                System.out.println("You entered an invalid number. Try again.");
                continue;
            }

            double num = Double.parseDouble(temp);
            d.addNumToData(num);
        }

        in.close();
        System.out.println("Average = " + d.getAvg());
        System.out.println("Maximum = " + d.getMax());

    }

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
