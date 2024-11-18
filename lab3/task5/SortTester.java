package lab3.task5;

import practice2.Time;
import lab3.task4.Employee;

public class SortTester {
    public static void main(String[] args) {
        System.out.println("Sorting Chocolates:");
        Chocolate[] chocolates = {
            new Chocolate("Dark", 70),
            new Chocolate("Super Dark", 50),
            new Chocolate("Mega Dark", 30),
            new Chocolate("Extra Dark", 90)
        };

        System.out.println("Before Bubble Sort:");
        printArray(chocolates);
        Sort.bubbleSort(chocolates);
        System.out.println("After Bubble Sort:");
        printArray(chocolates);

        Chocolate[] chocolates2 = {
            new Chocolate("Dark", 70),
            new Chocolate("Super Dark", 50),
            new Chocolate("Mega Dark", 30),
            new Chocolate("Extra Dark", 90)
        };

        System.out.println("Before Insertion Sort:");
        printArray(chocolates2);
        Sort.insertionSort(chocolates2);
        System.out.println("After Insertion Sort:");
        printArray(chocolates2);

        System.out.println("\nSorting Times:");
        Time[] times = {
            new Time(10, 15, 30),
            new Time(9, 45, 20),
            new Time(15, 30, 10),
            new Time(12, 0, 0)
        };

        System.out.println("Before Bubble Sort:");
        printArray(times);
        Sort.bubbleSort(times);
        System.out.println("After Bubble Sort:");
        printArray(times);

        Time[] times2 = {
            new Time(10, 15, 30),
            new Time(9, 45, 20),
            new Time(15, 30, 10),
            new Time(12, 0, 0)
        };

        System.out.println("Before Insertion Sort:");
        printArray(times2);
        Sort.insertionSort(times2);
        System.out.println("After Insertion Sort:");
        printArray(times2);

        System.out.println("\nSorting Employees:");
        Employee[] employees = {
            new Employee("Ilya", 50000),
            new Employee("Aruzhan", 40000),
            new Employee("Andrey", 60000),
            new Employee("Stas", 55000)
        };

        System.out.println("Before Bubble Sort:");
        printArray(employees);
        Sort.bubbleSort(employees);
        System.out.println("After Bubble Sort:");
        printArray(employees);

        Employee[] employees2 = {
            new Employee("Ilya", 50000),
            new Employee("Aruzhan", 40000),
            new Employee("Andrey", 60000),
            new Employee("Stas", 55000)
        };

        System.out.println("Before Insertion Sort:");
        printArray(employees2);
        Sort.insertionSort(employees2);
        System.out.println("After Insertion Sort:");
        printArray(employees2);
    }

    static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
        System.out.println();
    }
}
