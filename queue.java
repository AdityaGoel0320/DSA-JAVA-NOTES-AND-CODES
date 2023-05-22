import java.util.*;

public class queue {

    static void reverse(Queue<Integer> q1) {
        Stack<Integer> s1 = new Stack<>();
        while (q1.size() > 0) {
            s1.push(q1.remove());
        }
        while (s1.size() > 0) {
            q1.add(s1.pop());
        }
    }

    static class customStack {
        Queue<Integer> q1 = new LinkedList<>();

        customStack() {
        }

        customStack(Queue<Integer> q1) {
            this.q1 = q1;
        }

        void push(int x) {
            q1.add(x);

        }

        int pop() {
            reverse(q1);
            int x = q1.peek();
            reverse(q1);
            return x;

        }

        int peek() {
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        customStack s1 = new customStack();
        for (int i = 1; i <= 5; i++) {
            s1.push(i);
        }
        // System.out.println(s1.pop());
        // System.out.println(s1.pop());
        // System.out.println(s1.peek());

        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(1);
        a1.add(2);
        a1.add(1);
        a1.add(1);
        a1.add(1);
        System.out.println(a1);
        System.out.println(a1.get(1));
        
        System.out.println(a1.get(0));
    }

}
