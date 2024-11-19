package lab3.task3;

import java.util.ArrayList;
import java.util.Iterator;

public class UnOrdered<T> implements MyCollection<T> {
    private ArrayList<T> collections = new ArrayList<>();

    public UnOrdered() {}

    public UnOrdered(ArrayList<T> collections) {
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
