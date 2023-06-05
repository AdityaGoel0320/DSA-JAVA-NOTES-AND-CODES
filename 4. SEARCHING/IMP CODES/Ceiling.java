
//CEILING MEANS NO IN ARRAY JUST BIGGER THAN TARGET IF TARGET IS NOT THERE
public class Ceiling {
    //MAIN POINT IS THAT THE ARRAY SHOULD BE SORTED

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
        return arr[start] ;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search");
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        int target = 0 ;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}

    
