package BASIC;
import java.util.Arrays;

public class SumofTwoofArray {
    static void sum(int[] arr  , int target ){
        int sum = 0 ;
        for(int i = 0 ; i<=arr.length-1 ; i++){
            for(int j = i +1 ; j<=arr.length-1 ; j++){
                if(arr[i] + arr[j] == target){
                    System.out.printf("%d , %d" , i ,j);
                    System.out.println();
                    sum = sum +1 ;
                }
            }
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6} ;
        int target  = 6 ;
        sum(arr, target);
    }

}
