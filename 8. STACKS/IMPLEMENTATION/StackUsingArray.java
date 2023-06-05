package STACKS.IMPLEMENTATION;
import java.util.Arrays;

public class StackUsingArray {

    static class Stack {

        int[] arr = new int[10];
        int size = 0;
        int temp = -1;

        boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;
        }

        boolean isFull() {
            if (size == arr.length) {
                return true;
            }
            return false;
        }

        void push(int x) {
            if (isFull()) {
                System.out.println("stack is full");
                return;
            }
            temp++;
            arr[temp] = x;

            size++;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }
            int ans = arr[temp];
            size--;
            temp--;
            return ans;

        }

        void display() {
            System.out.println(Arrays.toString(arr));
        }

        int size() {
            return size;
        }

        int peek(){
            if(isFull() || isEmpty()){
                System.out.println("error");
                return -1 ; 
            }
            return arr[temp] ; 
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.display();
        System.out.println(s1.size);
        System.out.println(s1.peek());
    }
}
