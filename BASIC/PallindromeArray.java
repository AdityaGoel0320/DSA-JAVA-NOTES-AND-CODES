package BASIC;

public class PallindromeArray {
        static int pallindromenumber(int n) {
            int y = n;
            int rem = 0;
            int sum = 0;
            while (n > 0) {
    
                rem = n % 10;
                sum = sum * 10 + rem;
                n = n / 10;
    
            }
            if (sum == y) {
                return 1;
            }
            return -1;
        }
    
    
    
        static int pallindromeArray(int[] arr){
            int sum =0 ;
    
            int x = 0 ;
            for(int i =0 ; i<=arr.length-1 ; i++){
                x = pallindromenumber(arr[i]);
                sum = sum + x ;
            }
            if(sum == arr.length){
                return 1 ;
            }
            return 0 ;
        }
    
        public static void main(String[] args) {
    
            System.out.println();
            System.out.println("Welcome to pallindrome array");
            int[] arr = {121,141,131,151,171};
            int ans  = pallindromeArray(arr);
            System.out.println(ans);
            
    
        }
    }
    

