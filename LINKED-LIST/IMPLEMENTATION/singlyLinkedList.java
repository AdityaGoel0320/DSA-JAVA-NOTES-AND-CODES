package IMPLEMENTATION;
public class singlyLinkedList {
    private static class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

    static class SinglyLinkedList {

        static Node head = null;
        static Node tail = null;
        static int size = 0;

        void insertAtFirst(int val) {
            Node newnode = new Node(val);

            if (head == null) {
                head = newnode;
                tail = newnode;
            } else {
                newnode.next = head;
                head = newnode;
            }
            size++;
        }

        void insertAtEnd(int val) {
            Node newnode = new Node(val);
            if (head == null) {
                head = newnode;
                tail = newnode; // soch sahi se
            } else {
                tail.next = newnode;
                newnode.next = null;
                tail = newnode;
            }
            size++;

        }

        void insertatParticular(int val, int index) {
            // saare cases ko soch
            Node newnode = new Node(val);

            if (index >= size + 2 || index < 0) {
                System.out.println("enter valid input as index is greater than size");
                return;
            }

            if (head == null) {
                // insertAtFirst(val);
                head = newnode;
                tail = newnode;
                System.out.println("inserted at frst as list is empty");

            }

            if (index == size) {
                // insertAtEnd(val);
                tail.next = newnode;
                newnode.next = null;
                tail = newnode;
            } else {

                Node temp = head;
                for (int i = 1; i <= index - 1; i++) {
                    temp = temp.next;
                }
                newnode.next = temp.next;
                temp.next = newnode;
            }

            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("end");
        }

        int getElement(int index) {
            if (index < 0 || index >= size) {
                System.out.println("invalid index given");
            }
            if (head == null) {
                System.out.println("empty linked list");
                return -1;
            }
            if (index == 0) {
                return head.value;
            }
            if (index == size() - 1) {
                return tail.value;
            }

            Node temp = head;
            for (int i = 0; i <= index - 1; i++) {
                temp = temp.next;
            }
            return temp.value;
        }

        void deleteAtFirst() {
            if (head == null) {
                System.out.println("not possible empty linked list");
            } else {
                Node temp = head;
                head = temp.next;
                size--;
                System.out.println("deleted head having value " + temp.value);
            }
        }

        void deleteAtEnd() {
            if (head == null) {
                System.out.println("not possible empty linked list");

            } else {

                Node temp = head;
                int x = tail.value;
                for (int i = 0; i <= size - 3; i++) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                size--;
                System.out.println("deleted tail having value :- " + x);
            }
        }

        void deletAtParticular(int index) {
            if (head == null) {
                System.out.println("not possible empty linked list");

            } else {

                Node temp = head;
                for (int i = 0; i <= index - 2; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        }

        static int size() {
            Node temp = head;
            int count = 1;
            while (temp.next != null) {
                count++;
                temp = temp.next;

            }
            return count;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList l1 = new SinglyLinkedList();

        l1.insertAtFirst(0);
        l1.insertAtFirst(2);
        l1.insertAtFirst(3);
        l1.insertAtFirst(4);
        l1.insertAtEnd(5);
        l1.insertatParticular(10, 3);
        l1.display();
        l1.deleteAtFirst();
        l1.display();
        l1.deleteAtEnd();
        l1.display();
        l1.deletAtParticular(1);
        l1.display();
        System.out.println(SinglyLinkedList.size);
        System.out.println(l1.getElement(0));

    }

    
}
