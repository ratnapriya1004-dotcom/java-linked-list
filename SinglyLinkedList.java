// Singly Linked List using Generics
public class SinglyLinkedList<T> {
    private class Node {
        T data; Node next;
        Node(T data) { this.data = data; }
    }
    private Node head;
    private int size;

    public int length() { return size; }

    public void addFirst(T data) {
        Node n = new Node(data); n.next = head; head = n; size++;
    }
    public void addLast(T data) {
        Node n = new Node(data);
        if (head == null) head = n;
        else { Node c = head; while (c.next != null) c = c.next; c.next = n; }
        size++;
    }
    public void addAt(int index, T data) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Invalid index");
        if (index == 0) { addFirst(data); return; }
        if (index == size) { addLast(data); return; }
        Node c = head;
        for (int i = 0; i < index - 1; i++) c = c.next;
        Node n = new Node(data); n.next = c.next; c.next = n; size++;
    }
    public T removeFirst() {
        if (head == null) throw new IllegalStateException("List is empty");
        T value = head.data; head = head.next; size--; return value;
    }
    public T removeLast() {
        if (head == null) throw new IllegalStateException("List is empty");
        if (head.next == null) return removeFirst();
        Node c = head; while (c.next.next != null) c = c.next;
        T value = c.next.data; c.next = null; size--; return value;
    }
    public T removeAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        if (index == 0) return removeFirst();
        Node c = head; for (int i = 0; i < index - 1; i++) c = c.next;
        T value = c.next.data; c.next = c.next.next; size--; return value;
    }
    public void traverse() {
        Node c = head;
        while (c != null) { System.out.print(c.data + " -> "); c = c.next; }
        System.out.println("null");
    }
}
