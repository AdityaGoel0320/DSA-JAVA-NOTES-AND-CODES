import java.util.*; 
public class pwHashMap {
    public static void main(String[] args) {
        
        HashMap<Integer , Integer> h1 = new HashMap<>() ; 

        int[] arr = {1,3,2,1,4,1} ;
        int c = 0 ; 
        for(int i  = 0  ; i<=arr.length-1 ; i++){
            if(h1.get(arr[i])==null){
                h1.put(arr[i] , 1); 
            }
            else{
                int x = h1.get(arr[i]) ; 
                h1.put(arr[i] , x+1) ; 
            }
        }
        System.out.println(h1);
    }
    
}
