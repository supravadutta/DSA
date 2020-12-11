class Main {
  public static void main(String[] args) {
    int matrix[][] = {
       { 1, 2, 3 },
        { 4, 5, 6 },
         { 7, 8, 9 } 
        };
        solve(matrix);
  }

  static void solve(int matrix[][]) {
    int row = matrix.length;
    int column = matrix[0].length;
    int i, j;

    int max = -1;
    for (i = 0; i < row; i++)

    {
      int sum = 0;
      for (j = 0; j < column; j++) {
        sum = sum + matrix[i][j];

      }
      if (sum > max) {
        max = sum;
      }
      System.out.println("Row " + (i+1) + ": " + sum);
    }
    System.out.println("Row " + i + " is having the maximum sum " + max);

  }
}