import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E> {

    private class Node<T> {
        public T element;
        public Node<T> next;

        public Node(T element) {
            this.element = element;
            next = null;
        }
    }

    class MyIterator<U> implements Iterator<U> {
        private Node<U> current;

        public MyIterator() {
            current = (Node<U>)head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public U next() {
            U element = current.element;
            current = current.next;
            return element;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int count;

    public MyLinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    @Override
    public void add(E element) {
        Node<E> n = new Node(element);

        if(count == 0) {
            head = n;
        } else {
            tail.next = n;
        }
        tail = n;
        count++;
    }

    @Override
    public void add(int index, E element) {
        if(index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Index inválido");
        }

        Node<E> n = new Node(element);
        Node<E> aux = head;

        if(head == null) {
            head = n;
        } else if(index == 0) {
            n.next = aux;
            head = n;
        } else if(index == count) {
            tail.next = n;
            tail = n;
        } else {
            for(int i = 0; i < index; i++) {
                aux = aux.next;
            }
            n.next = aux.next;
            aux.next = n;
        }
        count++;
    }

    @Override
    public boolean remove(E element) {
        if(count == 0) {
            return false;
        }
        return true;
    }

    @Override
    public E remove(int index) {
        if(index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index inválido");
        }
        return null;
    }

    @Override
    public E get(int index) {
        if(index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index inválido");
        }
        Node<E> aux = head;

        for(int i = 0; i < index; i++) {
            aux = aux.next;
        }

        return aux.element;
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
