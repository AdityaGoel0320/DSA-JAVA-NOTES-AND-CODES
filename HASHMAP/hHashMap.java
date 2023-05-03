package HASHMAP;
import java.util.*;

public class hHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> h1 = new HashMap<>();
        h1.put("India", 1);
        h1.put("China", 0);
        System.out.println(h1);
        boolean checker = h1.containsKey("India");
        System.out.println("India is present :- " + checker);

        // iteration in array
        System.out.println("array is printing");
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("using differnt loop");

        for (int x : arr) {
            System.out.print(x + " ");
        }

        // for (h1.Entry<String, Integer> e : h1.entrySet()) {
        //     String key = e.getKey();
        //     System.out.println(key);
        //     Integer value = e.getValue();
        //     System.out.println(value);
            // do something with the key and value
        // }

    }

}
