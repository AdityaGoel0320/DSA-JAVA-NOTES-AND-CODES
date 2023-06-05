public class Rotated_BinarySearch {
    static int RotatedBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[start] < arr[mid]) {
                if (arr[mid] > target && arr[start] <= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target && arr[end] >= target) {
                    start = mid + 1;

                } else {
                    end = mid - 1;

                }
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Rotated binary search");
        int[] arr = {20,20,20,20,20,30,40,50,60,5,10};
        int target = 20 ;
        int ans = RotatedBinarySearch(arr, target);

        System.out.println(ans);
    }
}