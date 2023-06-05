
public class Normal_in2darrray {
    static void normalSearchIn2DArray(int[][] arr , int target){
        int sum =0 ;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<=arr.length -1 ; j++){
                if(arr[i][j]==target){
                    sum =sum+1 ;
                }
            }
        }
        if(sum>=1){
            System.out.println("found");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcone to normal search in 2d array");
        int[][] arr = {{1,2,3} ,{4,5,6} ,{7,8,9}};
        int target = 9 ;
        normalSearchIn2DArray(arr, target);


    }
    
}
