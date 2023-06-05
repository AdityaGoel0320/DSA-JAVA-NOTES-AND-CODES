public class customCircularQueueUsingArray {
    static class customCircularQueue {
        int size = 0;
        int front = -1;
        int rear = -1;
        int[] arr = new int[10];
        int l = arr.length;

        boolean isEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }

        boolean isFull() {
            if (size == l) {
                return true;
            } else {
                return false;
            }
        }

        void add(int x) throws Exception {
            // base case if queue is empty
            if (size == 0) {
                front = 0;
                rear = 0;
                arr[rear] = x;
                size++ ; 
            }
            // if size is full
            else if (size == l) {
                throw new Exception("Queue is full") ; 
            }

            // jab normal queue ki tatah reat is bigger than front
            else if (rear<=l-1) {
                rear++;
                arr[rear] = x;
                size++ ; 

            }
            // jab rear get looped so rear<front
            else if(rear==l-1){
                rear = 0 ; 
                arr[rear] = x ; 
                size++ ; 
            }
        }

        int delete() throws Exception {
            if (size == 0) {
                throw new Exception("queue is empty");
            } else {
                // jab front on end of array
                if (front == l - 1) {
                    int ans = arr[front];
                    front = 0;
                    size--;
                    return ans;
                }

                // jab normal front smaller than rear
                else {
                    int ans = arr[front];
                    front++;
                    size--;
                    return ans;

                }
            }
            // return -1; 
        }

        int  peek() throws Exception {

            if(size==0){
                throw new Exception("queue is empty") ; 
            }
            else{

                return arr[front] ; 
            }

        }

        void display() {
            if(size==0){
                System.out.println("queue is empty");
            }
            // jab normal queue as front<rear
            else if (front <= rear) {
                // normal loop fron front to rear
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            } 
            else if (front > rear) {
                // loop from front to l-1
                // than loop from 0 to rear
                for (int i = front; i <= l - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        customCircularQueue q1 = new customCircularQueue() ; 

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.display();
        System.out.println("size is : - " + q1.size);
        q1.delete();
        q1.display();
        System.out.println("size is : - " + q1.size);

    }
}