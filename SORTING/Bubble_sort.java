import java.util.*;

public class Bubble_sort {

  public static void main(String args[]) {
    ArrayList<Integer> arr = new ArrayList<>();
    int[] arr1 = { 7, 5, 3, 0, 0, 0, 0, 0, 0 };
    int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    for (int i = 0; i <= arr2.length - 1; i++) {
      int x = arr1[i] ^ arr2[i];
      if (x == 0) {
        arr.add(arr1[i]);

      }
    }
    for (int i = 0; i <= arr.size() - 1; i++) {
      System.out.println(arr.get(i));
    }
  }
}