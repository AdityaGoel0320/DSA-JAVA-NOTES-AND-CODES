import java.util.*;

public class java {
static void nearestSmallestToRightIndex(int[] arr) {
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
                ans[i] = x;
                s1.push(i);
                i--;

            }

            else if (s1.size() > 0 && arr[s1.peek()] > arr[i]) {
                while (s1.size() > 0 && arr[s1.peek()] > arr[i]) {
                    s1.pop();
                }

                if (s1.size() == 0) {

                    ans[i] = -1;
                    s1.push(i);
                    i--;

                } else {

                    int x = s1.peek();
                    ans[i] = x;
                    s1.push(i);
                    i--;

                }

            }



            
        }
        System.out.println(Arrays.toString(ans));
    }

    static void nearestSmallestToLeftIndex(int[] arr) {
        int l = arr.length;
        int[] ans = new int[l];
        int i = 0;
        Stack<Integer> s1 = new Stack<>();
        while (i <= l - 1) {
            if (s1.size() == 0) {
                ans[i] = -1;
                s1.push(i);
                i++;
            }

            else if (s1.size() > 0 && arr[s1.peek()] > arr[i]) {
                while (s1.size() > 0 && arr[s1.peek()] > arr[i]) {
                    s1.pop();
                }

                if (s1.size() == 0) {

                    ans[i] = -1;
                    s1.push(i);
                    i++;

                } else {

                    int x = s1.peek();
                    ans[i] = x;
                    s1.push(i);
                    i++;

                }

            } else if (s1.size() > 0 && arr[s1.peek()] < arr[i]) {
                int x = s1.peek();
                ans[i] = x;
                s1.push(i);
                i++;

            }
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {

        int[] arr = { 5, 2, 4, 6, 3, 5 };
        nearestSmallestToRightIndex(arr);
        nearestSmallestToLeftIndex(arr);

    }

}
