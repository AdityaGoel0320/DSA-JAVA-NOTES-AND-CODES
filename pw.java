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

    static void nearestSmallestToRight(int[] arr) {
        Stack<Integer> s1 = new Stack<>();
        int l = arr.length;
        int[] ans = new int[l];

        for (int i = l - 1; i >= 0; i--) {
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

    public static int[] calculateStockSpan(int[] arr) {
        int n = arr.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        // The first day always has a span of 1
        span[0] = 1;
        stack.push(0);

        for (int i = 0; i <= n - 1; i++) {
            // Pop elements from the stack while the stock arr are less than or equal to
            // the current price
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            // Calculate the span of the current day
            if (stack.isEmpty() == true) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();

            }
            // Push the current day onto the stack
            stack.push(i);
        }

        return span;
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

    public static void main(String[] args) {

        int[] arr = { 5, 2, 4, 6, 3, 5 };
        nearestSmallestToRight(arr);

        // int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
        // System.out.println(Arrays.toString(ans));
        // fnc(arr);
        // greaterToleft(arr);
        // greaterToRight(arr);
        // int[] span = calculateStockSpan(arr);

        // System.out.println("Stock arr: " + Arrays.toString(arr));
        // System.out.println("Stock Spans: " + Arrays.toString(span));
        // nearestSmallestToLeft(arr);
        // nearestSmallestToRight(arr);

    }
}
