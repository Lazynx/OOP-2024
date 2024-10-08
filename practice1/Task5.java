package practice1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int initialBalance = input.nextInt();
        int percent = input.nextInt();
        int result = initialBalance * percent / 100;
        System.out.println("Result " + result);
    }
}
