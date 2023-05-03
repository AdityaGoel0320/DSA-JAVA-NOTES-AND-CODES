import java.util.Stack;

public class pwStack {

    static Stack<Integer> reverse(Stack<Integer> s1 , Stack<Integer>ans){
        if(s1.empty()==true){
            return ans ; 
        }
        int x = s1.pop() ; 
        ans.push(x); 
        return reverse(s1, ans);
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> ans = new Stack<>();

        ans = reverse(s1 , ans);
        System.out.println(ans);


    }

}
