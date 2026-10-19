import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Object> s = new SinglyLinkedList<>();
        s.addFirst("A"); s.addLast(10); s.addAt(1, Arrays.asList(1, 2, 3));
        System.out.println("Singly:"); s.traverse();
        System.out.println("Length: " + s.length());
        s.removeFirst(); s.removeLast(); s.removeAt(0); s.traverse();

        DoublyLinkedList<String> d = new DoublyLinkedList<>();
        d.addFirst("A"); d.addLast("C"); d.addAt(1, "B");
        System.out.println("Doubly:"); d.traverse();
        System.out.println("Length: " + d.length());
        d.removeFirst(); d.removeLast(); d.removeAt(0); d.traverse();

        CircularLinkedList<Object> c = new CircularLinkedList<>();
        c.addFirst("A"); c.addLast(20); c.addAt(1, Arrays.asList("x", "y"));
        System.out.println("Circular:"); c.traverse();
        System.out.println("Length: " + c.length());
        c.removeFirst(); c.removeLast(); c.removeAt(0); c.traverse();
    }
}
