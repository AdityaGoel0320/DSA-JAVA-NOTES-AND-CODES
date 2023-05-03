import java.util.Arrays ;
public class Duplicatenumber {
    static void missingnumbers(int[] arr){
        int  i =0 ; 
        while(i<arr.length ){
            int correct_pos_ele = arr[i]-1 ; 
            if(arr[i]!=arr[correct_pos_ele]){
                int c = arr[i];
                arr[i] = arr[correct_pos_ele];
                arr[correct_pos_ele]  = c ;
            }
            else{
                i++ ;
            }
        }
        int[]  a  = new int[5] ; 
        for(int index=0  ;index<=arr.length-1 ; index++){
            if(index != arr[index]-1){
                
                System.out.println(arr[index]);
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1,2,3};
        missingnumbers(arr);
        
        System.out.println(Arrays.toString(arr));
    }
    
}

    
