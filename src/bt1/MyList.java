package bt1;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add( E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }
    public void add(int index, E element){
            if (size == elements.length) {
                ensureCapacity();
            }
        for (int j = size - 1; j >= index; j--) {
            System.out.println(size);
            elements[j + 1] = elements[j];
        }
        elements[index] = element;
    }

    public Object[] remove(int index) {
        for (int i = index; i < elements.length-1 ; i++) {
               elements[index]=elements[i+1];
        }
        return elements;
    }
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
    public int indexOf(E e){
        for (int i = 0; i <elements.length ; i++) {
            if (e==elements[i]){
                return i;
            }
        }
        return -1;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[i];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
