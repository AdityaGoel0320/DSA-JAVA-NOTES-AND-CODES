import java.util.*;

public class histogram {

        public static int[] findNearestSmallest(int[] arr) {
            int n = arr.length;
            int[] result = new int[n];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    result[i] = -1; // No smaller element found to the left
                } else {
                    result[i] = stack.peek();
                }
                stack.push(i);
            }

            // Convert indices to corresponding elements
            for (int i = 0; i < n; i++) {
                if (result[i] != -1) {
                    result[i] = arr[result[i]];
                }
            }

            return result;

        
    }


    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };
        int[] result = findNearestSmallest(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Indices of nearest smallest elements to the left: " + Arrays.toString(result));
    }

}
