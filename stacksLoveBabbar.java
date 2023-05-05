import java.util.Arrays;
import java.util.Stack;

public class stacksLoveBabbar {

    static int[] nextminElement(int[] arr) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(-1);

        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i > 0; i--) {
            int num = arr[i];
            while (s1.peek() >= num) {
                s1.pop();
            }
            // now ans is s1.peek
            ans[i] = s1.peek();
            s1.push(num);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] ans = nextminElement(arr);
        System.out.println(Arrays.toString(ans));
    }

}
