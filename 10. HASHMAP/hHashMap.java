import java.util.*;

public class hHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> h1 = new HashMap<>();

        h1.put("India", 1);
        h1.put("China", 0);

        System.out.println(h1);
        h1.remove("China");
        System.out.println(h1);
        boolean checker = h1.containsKey("India");
        System.out.println("India is present :- " + checker);

        for (String x : h1.keySet()) {
            System.out.printf(" %s  = %d", x, h1.get(x));
        }
        // iteration in array

        // for (h1.Entry<String, Integer> e : h1.entrySet()) {
        // String key = e.getKey();
        // System.out.println(key);
        // Integer value = e.getValue();
        // System.out.println(value);
        // do something with the key and value
        // }

    }

}
