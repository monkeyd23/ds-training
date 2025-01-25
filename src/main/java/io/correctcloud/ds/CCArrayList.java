package io.correctcloud.ds;

public class CCArrayList<T> {

    private T[] elements;
    public int size = 0;

    public CCArrayList() {
        elements = (T[]) new Object[10];
    }

    public void add(T element) {
        if (size == elements.length) {
            T[] newElements =(T[]) new Object[size * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = element;
    }

    public T get(int index) {
        return elements[index];
    }

    public void remove(int index) {
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    public void empty() {
        size = 0;
    }

}
