package IMPLEMENTATION;

public class customQueueUsingArray {
    static class customQueue {
        int[] arr = new int[10];
        int size = 0;
        int front = -1;
        int rear = -1;

        boolean isEmpty() {
            if (front == -1) {
                return true;
            }
            return false;
        }

        boolean isFull() {
            if (rear == arr.length - 1) {
                return true;
            }
            return false;
        }

        void add(int x) {
            if (front == -1) {
                front = 0;
            }
            if (isFull() == false) {
                rear++;
                arr[rear] = x;
                size++;
            } else {
                
                System.out.println("queue is full");
            }

        }

        int delete() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int ans = arr[front];
            front++;
            size--;
            return ans;
        }

        void display() {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        void peek() {
            if (isEmpty()) {
                System.out.println("no peek as queue id Empty");
            } else {
                System.out.println(arr[front]);
            }
        }
    }

    public static void main(String[] args) {
        customQueue q1 = new customQueue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        System.out.println("size is  "  + q1.size);
        q1.display();
        q1.peek();
    }

}
