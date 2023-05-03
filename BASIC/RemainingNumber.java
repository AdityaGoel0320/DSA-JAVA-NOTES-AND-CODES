package BASIC;
public class RemainingNumber {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        for (int i = 0; i < arr.length; i++) {

        }
    }

}
