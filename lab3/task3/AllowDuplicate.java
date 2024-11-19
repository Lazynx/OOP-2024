package lab3.task3;

import java.util.ArrayList;
import java.util.Iterator;

public class AllowDuplicate<T> implements MyCollection<T> {
    private ArrayList<T> collections = new ArrayList<>();

    public AllowDuplicate() {}

    public AllowDuplicate(ArrayList<T> collections) {
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
        for (T t : collections) {
            System.out.println(t);
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
