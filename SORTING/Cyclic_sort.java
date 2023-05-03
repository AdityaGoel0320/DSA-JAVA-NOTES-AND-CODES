import java.util.Arrays;

public class Cyclic_sort {
    static void CyclicSorting(int[] arr){
        
        int i = 0 ;
        while(i<=arr.length-1){
            int correct_postion = arr[i]-1 ;
            if(arr[i] !=  arr[correct_postion]){
                int c = arr[i] ;

                arr[i] = arr[correct_postion];
                arr[correct_postion] = c ;

            }
            else{
                i++;
            }

        }
    }
    public static void main(String[] args) {
        System.out.println("Welcone to Cyclic sorting");
        int[] arr  =  {3,5,2,1,4};
        CyclicSorting(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
