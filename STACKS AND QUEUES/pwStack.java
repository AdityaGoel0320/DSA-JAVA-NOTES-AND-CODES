import java.util.Arrays;
import java.util.*;

public class pwStack {

    static Stack<Integer> reverse(Stack<Integer> s1, Stack<Integer> ans) {
        if (s1.empty() == true) {
            return ans;
        }
        int x = s1.pop();
        ans.push(x);
        return reverse(s1, ans);
    }

    static void nearestSmallestToRight(int[] arr) {
        int l = arr.length;
        int[] ans = new int[l];
        int i = l - 1;
        Stack<Integer> s1 = new Stack<>();
        while (i >= 0) {
            if (s1.size() == 0) {
                ans[i] = -1;
                s1.push(i);
                i--;
            } else if (s1.size() > 0 && arr[s1.peek()] < arr[i]) {
                int x = s1.peek();
                ans[i] = arr[x];
                s1.push(i);
                i--;

            }

            else if (s1.size() > 0 && arr[s1.peek()] > arr[i]) {
                while (s1.size() > 0 && arr[s1.peek()] > arr[i]) {
                    s1.pop();
                }

                if (arr[s1.peek()] < arr[i]) {

                    int x = s1.peek();
                    ans[i] = arr[x];
                    s1.push(i);
                    i--;

                } else {
                    ans[i] = -1;
                    s1.push(i);
                    i--;
                }

            }
        }
        System.out.println(Arrays.toString(ans));
    }

    static void nearestSmallestToLeft(int[] arr) {
        int l = arr.length;
        int[] ans = new int[l];
        int i = 0;
        Stack<Integer> s1 = new Stack<>();
        while (i <= l - 1) {
            if (s1.size() == 0) {
                ans[i] = -1;
                s1.push(i);
                i++;
            } else if (s1.size() > 0 && arr[s1.peek()] > arr[i]) {
                while (s1.size() > 0 && arr[s1.peek()] > arr[i]) {
                    s1.pop();
                }

                if (arr[s1.peek()] < arr[i]) {

                    int x = s1.peek();
                    ans[i] = arr[x];
                    s1.push(i);
                    i++;

                } else {
                    ans[i] = -1;
                    s1.push(i);
                    i++;
                }

            }

            else if (s1.size() > 0 && arr[s1.peek()] < arr[i]) {
                int x = s1.peek();
                ans[i] = arr[x];
                s1.push(i);
                i++;

            }

            System.out.println(Arrays.toString(ans));
        }
    }

    public static void main(String[] args) {
        // Stack<Integer> s1 = new Stack<>();

        int[] arr = { 5, 2, 4, 6, 3, 5 };
        nearestSmallestToRight(arr);
        // nearestSmallestToLeft(arr);
        // Stack<Integer> ans = new Stack<>();

        // ans = reverse(s1, ans);
        // System.out.println(ans);

    }

}
