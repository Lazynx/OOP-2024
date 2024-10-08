package practice1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();

        String result;

        if (grade >= 95) {
            result = "A";
        } else if (grade >= 90) {
            result = "A-";
        } else if (grade >= 85) {
            result = "B+";
        } else if (grade >= 80) {
            result = "B";
        } else if (grade >= 75) {
            result = "B-";
        } else if (grade >= 70) {
            result = "C+";
        } else if (grade >= 65) {
            result = "C";
        } else if (grade >= 60) {
            result = "C-";
        } else if (grade >= 55) {
            result = "D+";
        } else if (grade >= 50) {
            result = "D";
        } else {
            result = "Retake";
        }

        System.out.println(result);
    }
}
