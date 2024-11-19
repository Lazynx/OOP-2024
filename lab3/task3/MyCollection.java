package lab3.task3;

import java.util.Iterator;

public interface MyCollection<T> extends Iterable<T> {
    void insert(T o);
    void remove(T o);
    void clear();
    int size();
    boolean isEmpty();
    void printAll();

    @Override
    Iterator<T> iterator();
}
