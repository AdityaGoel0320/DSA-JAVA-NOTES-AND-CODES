public class StacksUsingLinkedList {
    static class Node {
        int value;
        Node next;

        Node() {
        }
        Node(int x) {
            this.value = x;
        }
    }

    static class Stack {
        Node head = new Node();
        int size = 0;

        boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;
        }

        // as in linked list no need of isFull()

        void push(int x) {
            Node newnode = new Node(x);
            newnode.next = head;
            head = newnode;
            size++;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }
            int ans = head.value;
            head = head.next;
            size--;
            return ans;
        }

        void display() {
            Node temp = head;
            while (temp.next != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }

        int size() {
            return size;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("error");
                return -1;
            }
            return head.value;
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(11);

        System.out.println();

        System.out.println("display");
        s1.display();

        System.out.println("size");
        System.out.println(s1.size);

        System.out.println("pop");
        System.out.println(s1.pop());

        System.out.println("size");
        System.out.println(s1.size);


        
        System.out.println("peek");
        System.out.println(s1.peek());

    }

}
