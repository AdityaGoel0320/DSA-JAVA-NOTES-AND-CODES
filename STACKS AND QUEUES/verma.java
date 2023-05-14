import java.util.Stack;

public class verma {
    static class pair {
        int value;
        int idx;

        pair() {
            value = Integer.MIN_VALUE;
            idx = Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 100, 80, 60, 70, 60, 75, 85 };

        Stack<pair> s1 = new Stack<>();
        int l = arr.length;
        int[] ans = new int[l];

        for (int i = 0; i <= l - 1; i++) {
            if (s1.size() == 0) {
                ans[i] = 1;
            }
            else if(s1.size()>0 && s1.peek()>arr[i]){
                pair  p1 = s1.peek() ; 
                ans[i] = i - p1.idx ; 
            }
            else if(s1.size()>0 && s1.peek()<arr[i]){
                pair  p1 = s1.peek() ; 
                ans[i] = i - p1.idx ; 
            }

        }
    }
    
}



    