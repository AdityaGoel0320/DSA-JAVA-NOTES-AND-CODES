package STRINGS;

import java.util.Scanner;

public class StringInJava {
    public static void main(String[] args) {
        // String str = new String();
        // str = "aditya goel";
        // System.out.println(str);

        // Scanner sc = new Scanner(System.in);
        // String s1 = sc.nextLine();
        // String s2 = sc.next();
        // System.out.println(s1);
        // System.out.println(s2);

        // String s = "abcd";
        // for (int i = 0; i <= s.length() - 1; i++) {
        // for (int j = i+1; j <= s.length() ; j++) {

        // System.out.println(s.substring(i, j));

        // }
        // }

        // String z= "hello" ;
        // System.out.println(z.substring(0 , 2) + 'y' + z.substring(3));

        // System.out.println("abc"=="");

        // StringBuilder str = new StringBuilder("aditya goel") ;
        // str.delete(0, 3) ;
        // System.out.println(str);

        String s = "aaabbbbbccddde";
        String ans = "";
        int c = 0;
        int ptr = 0;
        for (int i = 1; i <= s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length() - 1; j++) {

                if (s.charAt(i) == s.charAt(i - 1)) {
                    c++;
                }
            }
        }
        System.out.println(c);
        String x = String.valueOf(121);
        System.out.println(x);
        System.out.println(x.charAt(0));
    }
}
