class Main {
  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 4, 5 }, { 3, 4, 7, 8 }, { 2, 9, 3, 1 } };
    int row_total = matrix.length;
    int col_total = matrix[0].length;
    for (int col = col_total - 1; col >= 0; col--) {
      for (int row = row_total - 1; row >= 0; row--) {
        System.out.print(matrix[row][col] + " ");

      }
      System.out.println();
    }
  }
}
