package io.correctcloud.ds;

public class CCArrayList {

    private Integer[] elements;
    public int size = 0;

    public CCArrayList() {
        elements = new Integer[10];
    }

    public void add(Integer element) {
        if (size == elements.length) {
            Integer[] newElements = new Integer[size * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = element;
    }

    public Integer get(int index) {
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
