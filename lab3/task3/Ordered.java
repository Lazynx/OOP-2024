package lab3.task3;

import java.util.Iterator;
import java.util.TreeSet;

public class Ordered<T> implements MyCollection<T> {
    TreeSet<T> collections = new TreeSet<>();

    public Ordered() {}

    public Ordered(TreeSet<T> collections) {
        this.collections = collections;
    }

    @Override
    public void insert(T o) {
        collections.add(o);
    }

    @Override
    public void remove(T o) {
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
    public void printAll() {
        for (T o : collections) {
            System.out.println(o);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return collections.iterator();
    }

    @Override
    public String toString() {
        return collections.toString();
    }
}
