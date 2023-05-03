import java.util.Arrays;

public class Selection_sorting {
    static int SelectionSorting(int[] arr){

        for(int i=0 ; i<=arr.length-2 ;i++){
            int min = i ;
            for(int j=i+1 ; j<=arr.length-1 ;j++){
                if(arr[min]>arr[j]){
                    min= j ;
                }
            } 
            if(min!=i){
                int c = arr[i];
                arr[i] =  arr[min];
                arr[min] = c ;
            }
        }
        return -1 ;
    }

   

    public static void main(String args[]) {
        System.out.println("Welcome to selection sorting");
        int[] arr  =  {10202,12011,5165,464,56,4156,5665,456651,541,5641,541};
        SelectionSorting(arr);
        System.out.println(Arrays.toString(arr));
        
    }

}
