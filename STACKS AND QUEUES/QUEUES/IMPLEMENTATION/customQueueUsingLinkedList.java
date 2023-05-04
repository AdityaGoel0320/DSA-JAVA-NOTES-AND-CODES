package IMPLEMENTATION;

public class customQueueUsingLinkedList {
    static class Node {
        int value;
        Node next;

        Node() {
        }

        Node(int x) {
            this.value = x;
        }
    }

    static class customQueue {
        int size = 0;
        Node head = null;
        Node tail = null;

        void push(int x) {
            Node newnode = new Node(x);
            if (head == null && tail == null) {
                head = tail = newnode;
            } else {

                tail.next = newnode;
                tail = newnode;
                newnode.next = null;
            }
            size++;
        }

        int delete() {
            if (size == 0) {
                return -1;
            } else {

                int ans = head.value;
                head = head.next;
                size--;
                return ans ; 
            }
        }

        void display() {
            if (head == null) {
                System.out.println("null");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int peek() {
            if (head == null) {
                return -1;
            } else {

                return head.value;
            }
        }

    }

    public static void main(String[] args) {
        customQueue q1 = new customQueue();
        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.push(4);
        q1.display();
        System.out.println("peek is " + q1.peek());
        System.out.println("size is : - " + q1.size);
        q1.delete();
        q1.display();
        System.out.println("size is : - " + q1.size);

    }
}
