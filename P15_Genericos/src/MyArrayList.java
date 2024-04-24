import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {
    private int CAPACITY;
    private E[] data;
    private int count;

    public MyArrayList() {
        CAPACITY = 10;
        data = (E[])(new Object[CAPACITY]);
        count = 0;
    }

    class MyIterator<E> implements Iterator<E> {
        private int current;

        public MyIterator() {
            current = 0;
        }

        @Override
        public boolean hasNext() {
            return (current < count);
        }

        @Override
        public E next() {
            E element = (E)data[current];
            current++;
            return element;
        }
    }

    @Override
    public void add(E element) {
        if(count == CAPACITY) {
            E[] newArray = (E[])(new Object[CAPACITY*2]);
            
            for(int i = 0; i < CAPACITY; i++) {
                newArray[i] = data[i];
            }
            data = newArray;
            CAPACITY = CAPACITY * 2;
        }
        data[count] = element;
        count++;
    }

    @Override
    public void add(int index, E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public E remove(E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public E get(int index) {
        if(index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index inválido");
        }
        return data[index];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator<E> getIterator() {
        return new MyIterator<E>();
    }

}
