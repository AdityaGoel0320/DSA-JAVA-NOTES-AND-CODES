package SEARCHING.TYPES;


public class Linear_search {
    static void LinearSearch(int[] arr , int target){
        int sum =0 ; 
        for(int i=0 ; i<arr.length ; i++){

            if(arr[i] == target){
                sum=sum+1 ;
            }
        }
        if(sum==1 ){
            System.out.println("target found 1 time ");
        }
        else{
            System.out.println("target found many times");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to linear search");
        int[] arr = {12,78,89,78,9,8,9,8,96,9};
        int target = 9 ;
        LinearSearch(arr, target);
    }
    
}
