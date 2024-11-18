package lab3.task3;

import java.util.TreeSet;

public class Ordered implements MyCollection {
    TreeSet<Object> collections = new TreeSet<>();

    public Ordered() {}

    public Ordered(TreeSet<Object> collections) {
        this.collections = collections;
    }

    @Override
    public void insert(Object o) {
        collections.add(o);
    }

    @Override
    public void remove(Object o) {
        collections.remove(o);
    }

    @Override
    public int size() {
        return collections.size();
    }

    @Override
    public boolean isEmpty() {
        return collections.isEmpty();
    }

    @Override
    public void clear() {
        collections.clear();
    }

    @Override
    public void print() {
        for (Object o : collections) {
            System.out.println(o);
        }
    }

    @Override
    public String toString() {
        return collections.toString();
    }
}
