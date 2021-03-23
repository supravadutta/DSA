import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] A = { { 5, 6, 1 }, { 3, 2, 7 }, { 9, 2, 8 } };
        int[][] B = { { 2, 3 }, { 5, 1 }, { 7, 8 } };
        int[][] Result = new int[A.length][B[0].length];
        if (A[0].length != B.length) {
            return;
        }
        for (int row = 0; row < Result.length; row++) {
            for (int col = 0; col < Result[0].length; col++) {
                int sum = 0;
                for (int i = 0; i < B.length; i++) {
                    sum = sum + (A[row][i] * B[i][col]);
                }
                Result[row][col] = sum;
            }
        }
        for (int i = 0; i < Result.length; i++) {
            for (int j = 0; j < Result[0].length; j++) {
                System.out.print(Result[i][j] + " ");
            }
            System.out.println();
        }
    }
}