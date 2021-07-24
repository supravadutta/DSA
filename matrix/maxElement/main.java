import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(max(matrix, row, col));
        System.out.println(min(matrix, row, col));
    }

    static int max(int[][] matrix, int row, int col) {
        int max_el = Integer.MIN_VALUE;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] > max_el) {
                    max_el = matrix[i][j];
                }

            }
        }
        return max_el;
    }

    static int min(int[][] matrix, int row, int col) {
        int min_el = Integer.MAX_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] < min_el) {
                    min_el = matrix[i][j];
                }

            }
        }
        return min_el;

    }
}