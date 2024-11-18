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
        AllowDuplicate allowDuplicate = new AllowDuplicate(new ArrayList<>());
        allowDuplicate.insert("A");
        allowDuplicate.insert("B");
        allowDuplicate.insert("C");
        allowDuplicate.print();

        System.out.println("Size: " + allowDuplicate.size());
        allowDuplicate.remove("A");
        allowDuplicate.print();

        allowDuplicate.clear();
        System.out.println("Is Empty: " + allowDuplicate.isEmpty());
    }

    private static void testNotAllowDuplicate() {
        NotAllowDuplicate notAllowDuplicate = new NotAllowDuplicate(new HashSet<>());
        notAllowDuplicate.insert("A");
        notAllowDuplicate.insert("B");
        notAllowDuplicate.insert("A");
        notAllowDuplicate.print();

        System.out.println("Size: " + notAllowDuplicate.size());
        notAllowDuplicate.remove("A");
        notAllowDuplicate.print();

        notAllowDuplicate.clear();
        System.out.println("Is Empty: " + notAllowDuplicate.isEmpty());
    }

    private static void testOrdered() {
        Ordered ordered = new Ordered(new TreeSet<>());
        ordered.insert("B");
        ordered.insert("A");
        ordered.insert("C");
        ordered.print();

        System.out.println("Size: " + ordered.size());
        ordered.remove("B");
        ordered.print();

        ordered.clear();
        System.out.println("Is Empty: " + ordered.isEmpty());
    }

    private static void testUnOrdered() {
        UnOrdered unOrdered = new UnOrdered(new ArrayList<>());
        unOrdered.insert("B");
        unOrdered.insert("A");
        unOrdered.insert("C");
        unOrdered.print();

        System.out.println("Size: " + unOrdered.size());
        unOrdered.remove("A");
        unOrdered.print();

        unOrdered.clear();
        System.out.println("Is Empty: " + unOrdered.isEmpty());
    }
}
