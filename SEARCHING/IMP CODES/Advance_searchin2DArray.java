

import java.util.Arrays;

public class Advance_searchin2DArray {
    static int[] Advance_searchin2DArra(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] { row, col };
            }
            if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }

        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        System.out.println("Welcome to advance search in 2d arrat in this we reduce rows and col acc to conditions");
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        int target = 37;
        int[] x= Advance_searchin2DArra(arr, target) ;
        System.out.println(Arrays.toString(x));
    }

}
