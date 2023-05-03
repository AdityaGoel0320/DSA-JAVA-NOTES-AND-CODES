package IMPLEMENTATION;
public class DLL {
    private static class Node {

        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {

            this.value = value;
            this.next = next;
            // this.previous = previous;

        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertatfirsrt(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        newnode.previous = null;
        if (head != null) {
            head.previous = newnode;

        }
        head = newnode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " " + " <=> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void displaypreorder() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " " + " <=> ");
            temp = temp.previous;
        }
        System.out.println("start");
    }

    void insetatendll(int val) {
        Node newnode = new Node(val);
        newnode.previous = tail;
        newnode.next = null;
        tail.next = newnode;
        tail = newnode;
        size++;
    }

    void insertatpart(int val, int index) {
        Node temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        Node newnode = new Node(val, temp.next);
        temp.next = newnode;
        size++;
    }

    void insertatpartnode(int val, int x) {
        Node temp = head;

        for (int i = 1; i <= size - 1; i++) {
            if (temp.value == x) {
                break;
            }
        }

        Node newnode = new Node(val);
        newnode.next = temp.next;
        temp.next.previous = newnode;

        temp.next = newnode;
        newnode.previous = temp;

    }

    public static void main(String[] args) {
        DLL d1 = new DLL();
        d1.insertatfirsrt(7);
        d1.insertatfirsrt(5);
        d1.insertatfirsrt(2);
        d1.insertatfirsrt(8);

        // d1.insetatendll(11);

        // d1.insertatpart(0, 1);
        // d1.insertatpartnode(5, 3);

        d1.display();

        System.out.println();

        // d1.displaypreorder();

        System.out.println();

    }
}
