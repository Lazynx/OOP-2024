package practice1;

import java.util.Scanner;

public class Task6 {
    public static boolean isPalindrome(String string1) {
        String string2 = "";
        for (int i = string1.length() - 1; i >= 0; i--) {
            string2 += string1.charAt(i);
        }

         return string2.equals(string1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string1 = input.nextLine();
        System.out.println(isPalindrome(string1));
    }
}
