// Circular Singly Linked List using Generics
public class CircularLinkedList<T> {
    private class Node {
        T data; Node next;
        Node(T data) { this.data = data; }
    }
    private Node tail;
    private int size;
    private Node head() { return tail == null ? null : tail.next; }

    public int length() { return size; }

    public void addFirst(T data) {
        Node n = new Node(data);
        if (tail == null) { tail = n; n.next = n; }
        else { n.next = tail.next; tail.next = n; }
        size++;
    }
    public void addLast(T data) { addFirst(data); tail = tail.next; }

    public void addAt(int index, T data) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Invalid index");
        if (index == 0) { addFirst(data); return; }
        if (index == size) { addLast(data); return; }
        Node c = head(); for (int i = 0; i < index - 1; i++) c = c.next;
        Node n = new Node(data); n.next = c.next; c.next = n; size++;
    }
    public T removeFirst() {
        if (tail == null) throw new IllegalStateException("List is empty");
        Node first = tail.next; T value = first.data;
        if (size == 1) tail = null; else tail.next = first.next;
        size--; return value;
    }
    public T removeLast() {
        if (tail == null) throw new IllegalStateException("List is empty");
        if (size == 1) return removeFirst();
        Node c = head(); while (c.next != tail) c = c.next;
        T value = tail.data; c.next = tail.next; tail = c; size--; return value;
    }
    public T removeAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();
        Node c = head(); for (int i = 0; i < index - 1; i++) c = c.next;
        T value = c.next.data; c.next = c.next.next; size--; return value;
    }
    public void traverse() {
        if (tail == null) { System.out.println("List is empty"); return; }
        Node c = head();
        for (int i = 0; i < size; i++) { System.out.print(c.data + " -> "); c = c.next; }
        System.out.println("(back to first node)");
    }
}
