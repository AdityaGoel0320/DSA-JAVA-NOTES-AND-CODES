package BASIC;
import java.util.Arrays ;

public class Reverse_array {
        
    
    public static void main(String[] args){
        System.out.println("Welcome to Java");
        int[] arr = {7,8,9,10,11,12};
        for(int i=0 ; i<arr.length/2 ;i++){
            int c = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = c ;
        }
        System.out.println(Arrays.toString(arr));

    }
    
}

