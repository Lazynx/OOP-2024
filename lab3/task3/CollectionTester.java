package lab3.task3;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;

public class CollectionTester {
    public static void main(String[] args) {
        System.out.println("Testing AllowDuplicate:");
        testAllowDuplicate();

        System.out.println("\nTesting NotAllowDuplicate:");
        testNotAllowDuplicate();

        System.out.println("\nTesting Ordered:");
        testOrdered();

        System.out.println("\nTesting UnOrdered:");
        testUnOrdered();
    }

    private static void testAllowDuplicate() {
        MyCollection<String> allowDuplicate = new AllowDuplicate<>();
        allowDuplicate.insert("A");
        allowDuplicate.insert("B");
        allowDuplicate.insert("C");
        allowDuplicate.insert("A"); // Дубликат

        System.out.println("Items after insertion:");
        allowDuplicate.printAll();

        System.out.println("Size: " + allowDuplicate.size());
        allowDuplicate.remove("A");
        System.out.println("Items after removing 'A':");
        allowDuplicate.printAll();

        allowDuplicate.clear();
        System.out.println("Is Empty after clear? " + allowDuplicate.isEmpty());
    }

    private static void testNotAllowDuplicate() {
        MyCollection<String> notAllowDuplicate = new NotAllowDuplicate<>();
        notAllowDuplicate.insert("A");
        notAllowDuplicate.insert("B");
        notAllowDuplicate.insert("A"); // Дубликат (не добавится)

        System.out.println("Items after insertion:");
        notAllowDuplicate.printAll();

        System.out.println("Size: " + notAllowDuplicate.size());
        notAllowDuplicate.remove("A");
        System.out.println("Items after removing 'A':");
        notAllowDuplicate.printAll();

        notAllowDuplicate.clear();
        System.out.println("Is Empty after clear? " + notAllowDuplicate.isEmpty());
    }

    private static void testOrdered() {
        MyCollection<String> ordered = new Ordered<>();
        ordered.insert("B");
        ordered.insert("A");
        ordered.insert("C");

        System.out.println("Items after insertion (should be sorted):");
        ordered.printAll();

        System.out.println("Size: " + ordered.size());
        ordered.remove("B");
        System.out.println("Items after removing 'B':");
        ordered.printAll();

        ordered.clear();
        System.out.println("Is Empty after clear? " + ordered.isEmpty());
    }

    private static void testUnOrdered() {
        MyCollection<String> unOrdered = new UnOrdered<>();
        unOrdered.insert("B");
        unOrdered.insert("A");
        unOrdered.insert("C");

        System.out.println("Items after insertion:");
        unOrdered.printAll();

        System.out.println("Size: " + unOrdered.size());
        unOrdered.remove("A");
        System.out.println("Items after removing 'A':");
        unOrdered.printAll();

        unOrdered.clear();
        System.out.println("Is Empty after clear? " + unOrdered.isEmpty());
    }
}
