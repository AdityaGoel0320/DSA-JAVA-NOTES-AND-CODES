package PATTERNS;
import java.util.Scanner;


public class PatternCode {
    static void pattern1(int n) {
        // *****
        // *****
        // *****
        // *****
        // *****
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print("*");

                }
            }

            System.out.println();
        }

    }

    static void pattern3(int n) {
        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= 6 - i) {

                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {

                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }

    static void pattern5(int n) {

        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {

                    System.out.print("*");
                }

            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (j <= 5 - i) {

                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    static void pattern6(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= n + 1 - i && j <= n) {

                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    static void pattern7(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    static void pattern8(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 4; j++) {
                if (j >= n + 1 - i && j <= 4 + i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    static void pattern9(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 4; j++) {
                if (j >= i && j <= 10 - i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    static void pattern10(int n) {

        int k = 0;

        for (int i = 1; i <= n; i++) {
            k = 1;
            for (int j = 1; j <= n + 4; j++) {
                if (j >= n + 1 - i && j <= n - 1 + i && k == 1) {
                    System.out.print("*");
                    k = 0;

                } else {
                    System.out.print(" ");
                    k = 1;
                }
            }

            System.out.println();
        }

    }

    static void pattern11(int n) {

        int k = 0;

        for (int i = 1; i <= n; i++) {
            k = 1;
            for (int j = 1; j <= n + 4; j++) {
                if (j >= i && j <= 2 * n - i && k == 1) {
                    System.out.print("*");
                    k = 0;

                } else {
                    System.out.print(" ");
                    k = 1;
                }
            }

            System.out.println();
        }

    }

    static void pattern12(int n) {

        int k = 0;
        for (int i = 1; i <= n; i++) {
            k = 1;
            for (int j = 1; j <= n + 4; j++) {
                if (j >= i && j <= 2 * n - i && k == 1) {
                    System.out.print("*");
                    k = 0;

                } else {
                    System.out.print(" ");
                    k = 1;
                }
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            k = 1;
            for (int j = 1; j <= n + 4; j++) {
                if (j >= n + 1 - i && j <= n - 1 + i && k == 1) {
                    System.out.print("*");
                    k = 0;

                } else {
                    System.out.print(" ");
                    k = 1;
                }
            }

            System.out.println();
        }

    }

    static void pattern13(int n) {

        int k = 0;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n+4 ; j++) {

                if (i != n) {
                    if (j == n+1 - i || j == n-1 + i && k==0) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");

                    }
                }
                else{
                    k=1 ;
                    if(j>=n+1-1 && j<=n-1+i && k==1){
                        System.out.print("*");
                    }
                    if(j>=n+1-1 && j<=n-1+i-1 && k==1){
                        System.out.print("*");
                    }
                }

            }

            System.out.println();

            // for (int q = 1; q <= 9; q++) {
            //     System.out.print("*");
            // }

        }

    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to pattern codes ");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n(rows) :- ");
        int n = sc.nextInt();
        System.out.println();

        // pattern1(n);
        // System.out.println();

        // pattern2(n);
        // System.out.println();

        // pattern3(n);
        // System.out.println();

        // pattern4(n);
        // System.out.println();

        // pattern5(n);
        // System.out.println();

        // pattern6(n);
        // System.out.println();

        // pattern7(n);
        // System.out.println();

        // pattern8(n);
        // System.out.println();

        // pattern9(n);
        // System.out.println();

        // pattern10(n);
        // System.out.println();

        // pattern11(n);
        // System.out.println();

        // pattern12(n);
        // System.out.println();

        pattern13(n);
        System.out.println();

    }

}
