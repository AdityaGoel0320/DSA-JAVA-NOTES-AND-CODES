import java.util.*;

public class pw {

    static void greaterToRight(int[] arr) {
        Stack<Integer> s1 = new Stack<>();
        int[] ans = { -1, -1, -1, -1 };
        int l = arr.length;

        for (int i = 0; i <= l - 1; i++) {
            if (s1.size() == 0) {
                ans[i] = -1;
            } else if (s1.size() > 0 && s1.peek() > arr[i]) {
                ans[i] = s1.peek();
            } else if (s1.size() > 0 && s1.peek() <= arr[i]) {
                while (s1.size() > 0 && s1.peek() <= arr[i]) {
                    s1.pop();
                }
                if (s1.size() == 0) {
                    ans[i] = -1;
                } else {
                    ans[i] = s1.peek();

                }
            }
            s1.push(arr[i]);

        }
        System.out.println(Arrays.toString(ans));

    }

    static void greaterToleft(int[] arr) {
        Stack<Integer> s1 = new Stack<>();
        int[] ans = { -1, -1, -1, -1 };
        int l = arr.length;

        for (int i = l - 1; i >= 0; i--) {
            if (s1.size() == 0) {
                ans[i] = -1;
            } else if (s1.size() > 0 && s1.peek() > arr[i]) {
                ans[i] = s1.peek();
            } else if (s1.size() > 0 && s1.peek() <= arr[i]) {
                while (s1.size() > 0 && s1.peek() <= arr[i]) {
                    s1.pop();
                }
                if (s1.size() == 0) {
                    ans[i] = -1;
                } else {
                    ans[i] = s1.peek();

                }
            }
            s1.push(arr[i]);

        }
        System.out.println(Arrays.toString(ans));

    }

    static void nearestSmallestToLeft(int[] arr) {
        Stack<Integer> s1 = new Stack<>();
        int[] ans = { -1, -1, -1, -1, -1 };
        int l = arr.length;

        for (int i = 0; i <= l - 1; i++) {
            if (s1.size() == 0) {
                ans[i] = -1;
            } else if (s1.size() > 0 && s1.peek() < arr[i]) {
                ans[i] = s1.peek();
            } else if (s1.size() > 0 && s1.peek() >= arr[i]) {
                while (s1.size() > 0 && s1.peek() >= arr[i]) {
                    s1.pop();
                }
                if (s1.size() == 0) {
                    ans[i] = -1;
                } else {
                    ans[i] = s1.peek();

                }
            }
            s1.push(arr[i]);

        }
        System.out.println(Arrays.toString(ans));

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8, };
        // System.out.println(Arrays.toString(ans));
        // fnc(arr);
        // greaterToleft(arr);
        // greaterToRight(arr);
        nearestSmallestToLeft(arr);

    }
}

// dgvbjfjvfbujvjuvf
// dgvbjfjvfbujvjuvf
// dgvbjfjvfbujvjuvf\vfbujvbdfjvb
