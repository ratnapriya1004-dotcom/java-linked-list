// Doubly Linked List using Generics
public class DoublyLinkedList<T> {
    private class Node {
        T data; Node previous, next;
        Node(T data) { this.data = data; }
    }
    private Node head, tail;
    private int size;

    public int length() { return size; }

    public void addFirst(T data) {
        Node n = new Node(data);
        if (head == null) head = tail = n;
        else { n.next = head; head.previous = n; head = n; }
        size++;
    }
    public void addLast(T data) {
        Node n = new Node(data);
        if (tail == null) head = tail = n;
        else { tail.next = n; n.previous = tail; tail = n; }
        size++;
    }
    public void addAt(int index, T data) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Invalid index");
        if (index == 0) { addFirst(data); return; }
        if (index == size) { addLast(data); return; }
        Node c = head; for (int i = 0; i < index; i++) c = c.next;
        Node n = new Node(data); n.previous = c.previous; n.next = c;
        c.previous.next = n; c.previous = n; size++;
    }
    public T removeFirst() {
        if (head == null) throw new IllegalStateException("List is empty");
        T value = head.data;
        if (head == tail) head = tail = null;
        else { head = head.next; head.previous = null; }
        size--; return value;
    }
    public T removeLast() {
        if (tail == null) throw new IllegalStateException("List is empty");
        T value = tail.data;
        if (head == tail) head = tail = null;
        else { tail = tail.previous; tail.next = null; }
        size--; return value;
    }
    public T removeAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();
        Node c = head; for (int i = 0; i < index; i++) c = c.next;
        c.previous.next = c.next; c.next.previous = c.previous; size--; return c.data;
    }
    public void traverse() {
        Node c = head;
        while (c != null) { System.out.print(c.data + " <-> "); c = c.next; }
        System.out.println("null");
    }
}
