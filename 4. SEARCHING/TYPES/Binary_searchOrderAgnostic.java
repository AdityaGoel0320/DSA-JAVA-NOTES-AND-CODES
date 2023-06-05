//MAIN POINT IS THAT THE ARRAY SHOULD BE SORTED
package SEARCHING.TYPES;

public class Binary_searchOrderAgnostic {
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        
        while (start <= end) {
            int mid = start + (end - start) / 2; // declare here only as mid is changing with loop
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1 ;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search");
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        int target = 3;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}
