package lab3.task3;

import java.util.HashSet;
import java.util.Iterator;

public class NotAllowDuplicate<T> implements MyCollection<T> {
    private HashSet<T> collections = new HashSet<>();

    public NotAllowDuplicate() {}

    public NotAllowDuplicate(HashSet<T> collections) {
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
