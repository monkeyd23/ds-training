package io.correctcloud.ds;

public class CCLinkedList<T> {
    private Node head;
    private Node tail;
    public int size = 0;

    public void add(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    private Node getNode(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public T get(int index) {
        Node current = getNode(index);
        return (T) current.data;
    }

    public void remove(int index) {
        Node current = getNode(index-1);
        current.next = current.next.next;
        size--;
    }


    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            System.out.println("  |");
            System.out.println("  V");
            current = current.next;
        }
    }

}
