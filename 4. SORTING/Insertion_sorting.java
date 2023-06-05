import java.util.Arrays;

public class Insertion_sorting {
    static void InsertionSorting(int[] arr){
        for(int i= 0 ; i<=arr.length-2 ;i++){
            for(int j = i+1 ; j>0 ; j--){
                if(arr[j-1]>arr[j]){
                    int c = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = c ;
                } 
                else{
                    break ; 
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Insertion Sorting");
        int[] arr = {5,3,4,1,2};
        InsertionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
