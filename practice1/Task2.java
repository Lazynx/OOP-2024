package practice1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int area = Math.abs(a * a);
        int perimeter = 4 * a;
        double lengthOfDiagonal = a * Math.sqrt(2);
        System.out.println("Area = " + area + "\nPerimeter = " + perimeter + "\nLength of diagonal = " + lengthOfDiagonal);
    }
}
