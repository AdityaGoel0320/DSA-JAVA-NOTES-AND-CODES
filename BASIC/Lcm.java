package BASIC;
import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        System.out.println("Welcome to find LCM of 2 numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number:- ");
        int a = sc.nextInt();
        int lcm = 0;
        System.out.print("Enter your 2nd number:- ");
        int b = sc.nextInt();
        int max = a;

        if(a<b){
            max = b ;
        }

        for(int i =max ; i<=a*b ; i+=max){
            if(i%a ==0 && i%b ==0 ){
                lcm=i ;
            }
        }
        System.out.println(lcm);
    }

}
