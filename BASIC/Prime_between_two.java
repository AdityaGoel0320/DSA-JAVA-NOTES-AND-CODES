package BASIC;

import java.util.Scanner;

public class Prime_between_two {
    public static void main(String[] args) {
        System.out.println("Welcome to Prime_between_two ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number:- ");
        int a = sc.nextInt();
        System.out.print("Enter your 2nd number:- ");
        int b = sc.nextInt();
        int sum = 0;
        int i =0, j = 0 ;
        for ( i = a; i <= b; i++) {
            for ( j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break ;
                }
            }
            if (i==j) {
                System.out.println(j);
    
        }
        }
       
}
}