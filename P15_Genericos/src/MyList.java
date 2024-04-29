// interface genérica para lista

import java.util.Iterator;

public interface MyList<E> extends Iterable<E> {
    void add(E element);
    void add(int index, E element);
    E remove(int index);
    boolean remove(E element);
    E get(int index);
    int size();
    Iterator<E> getIterator();
}