package BASIC;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        System.out.println("Welcome to find HCF of 2 numbers");
        Scanner sc = new Scanner(System.in);
        //hcf means aisa biggest factor jo dono ko div kare and also it can always equalor less than min no  
        System.out.print("Enter your 1st number:- ");
        int a = sc.nextInt() ;
        int hcf =0 ;
        System.out.print("Enter your 2nd number:- ");
        int b = sc.nextInt() ;
        int min =a ;
        if(a>b){
            min = b ;
        }

        for(int i =1 ; i<=min ; i++){
            if(a%i == 0 && b%i == 0){
                hcf = i ;
            }
        }
        System.out.println(hcf);
    }
    
}
