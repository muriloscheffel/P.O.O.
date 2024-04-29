import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {
    private int CAPACITY;
    private E[] data;
    private int count;

    public MyArrayList() {
        CAPACITY = 10;
        count = 0;
        data = (E[])(new Object[CAPACITY]);
    }

    public class MyIterator<E> implements Iterator<E>{
        private int current;

        public MyIterator(){
            current = 0;
        }

        @Override
        public boolean hasNext() {
            return current < count;
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
        if(index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index inválido");
        }
        count++;
    }

    @Override
    public boolean remove(E element) {
        if(count == 0) {
            return false;
        }
        count--;

        return true;
    }

    @Override
    public E remove(int index) {
        if(index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index inválido");
        }
        Object elemento = data[index];

        if(index == (count - 1)) {
            data[index] = null;
        }
        if(index < (count - 1)) {
            for(int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            data[count - 1] = null;
        }
        count--;

        return (E)elemento;
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
    public Iterator<E> iterator() {
        return new MyIterator<E>();
    }

    @Override
    public Iterator<E> getIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIterator'");
    }

}
