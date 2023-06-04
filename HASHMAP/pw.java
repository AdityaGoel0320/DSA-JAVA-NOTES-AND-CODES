package HASHMAP;

import java.util.HashMap;

public class pw {
    static HashMap<Character, Integer> makeFreqMap(String str) {
        HashMap<Character, Integer> h1 = new HashMap<>();

        for (int i = 0; i <= str.length() - 1; i++) {
            Character c1 = str.charAt(i);

            if (h1.containsKey(c1)) {
                int freq = h1.get(c1);
                h1.put(c1, freq + 1);
            } else {
                h1.put(c1, 1);

            }
        }
        return h1;
    }

    static boolean anagram(String str1, String str2) {
        HashMap<Character, Integer> h1 = makeFreqMap(str1);
        HashMap<Character, Integer> h2 = makeFreqMap(str2);

        return h1.equals(h2);
    }

    public static void main(String[] args) {

        System.out.println(
                anagram("knee", "")

        );

    }

}
