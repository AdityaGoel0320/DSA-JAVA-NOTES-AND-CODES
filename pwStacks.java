import java.util.Stack;

public class pwStacks {

    static boolean fnc(String str) {
        int i = 0;
        int l = str.length();
        Stack<Character> s1 = new Stack<>();
        while (i <= l - 1) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                s1.push(str.charAt(i));

            } else {
                if (s1.size() > 0) {
                    if (s1.peek() == '(' && str.charAt(i) == ')') {

                        s1.pop();
                    } else if (s1.peek() == '[' && str.charAt(i) == ']') {
                        s1.pop();
                    } else if (s1.peek() == '{' && str.charAt(i) == '}') {
                        s1.pop();
                    }
                } else {
                    return false;
                }
            }

            i++;
        }
        if (s1.size() == 0) {

            return true;
        } else {
            return false;
        }
    }

    static void consecutoine(int[] arr) {
        int l = arr.length;
        int i = 1;

        Stack<Integer> s1 = new Stack<>();
        s1.push(arr[0]);

        while (i <= l - 1) {
            if (s1.size() > 0 && s1.peek() != arr[i]) {
                s1.push(arr[i]);
                i++;
            } else {
                if (i <= l - 1) {
                    i++;
                } else {
                    break;
                }
                while (s1.peek() == arr[i]) {
                    s1.pop();
                }
                while (arr[i] == arr[i - 1]) {
                    if (i <= l - 1) {
                        i++;
                    } else {
                        break;
                    }
                }

            }



            
        }
        System.out.println(s1);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Question on Stack in java");
        System.out.println();

        String str = "{{{{{{{{{{{{[[[[[[[[(((((((((()))))))))]]]]]]]]}}}}}}}}}}}}";
        System.out.println(fnc(str));

        System.out.println();

        int[] arr = { 1,2,2,3,4,5,5,5,6,6,6,6};
        consecutoine(arr);
    }

}
