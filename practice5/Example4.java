package practice5;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       String[] operations = makeOperationList(in);

       for (String operation : operations) {
          solveOperation(operation);
       }

       in.close();
    }

    private static String[] makeOperationList(Scanner in) {
       StringTokenizer tokenizer = new StringTokenizer(in.nextLine(), " ");
       String[] operations = new String[tokenizer.countTokens()];
       for (int i = 0; i < operations.length; i++) {
          operations[i] = tokenizer.nextToken();
       }
       return operations;
    }

    private static void solveOperation(String operation) {
       double                 leftOperand, result, rightOperand;
       String                 leftString, operator, rightString;
       StringTokenizer        tokenizer;

       tokenizer = new StringTokenizer(operation, "+*-/", true);

       try {
          leftString   = tokenizer.nextToken();
          operator     = tokenizer.nextToken();
          rightString  = tokenizer.nextToken();

          boolean isLeftNumber = isNumber(leftString);
          boolean isRightNumber = isNumber(rightString);

          if (!isLeftNumber && !isRightNumber) {
             System.out.println(leftString +  " and " + rightString + " are not a numbers\n");
             return;
          } else if (!isLeftNumber) {
             System.out.println(leftString + " is not a number\n left one");
             return;
          } else if (!isRightNumber) {
             System.out.println(rightString + " is not a number\n right one");
             return;
          }

          leftOperand = Double.parseDouble(leftString);
          rightOperand = Double.parseDouble(rightString);

          switch (operator) {
             case "+":
                result = leftOperand + rightOperand;
                break;
             case "-":
                result = leftOperand - rightOperand;
                break;
             case "*":
                result = leftOperand * rightOperand;
                break;
             case "/":
                if (rightOperand == 0) {
                   System.out.println("Division by zero");
                   return;
                }
                result = leftOperand / rightOperand;
                break;
             default:
                result = 0.0;
          }

          System.out.println("Result: " + result);
       } catch (NoSuchElementException nsee) {
          System.out.println("Invalid syntax");
       }
       System.out.println();
    }

    private static boolean isNumber(String number) {
       try {
          Double.parseDouble(number);
          return true;
       } catch (NumberFormatException e) {
          return false;
       }
    }
}
