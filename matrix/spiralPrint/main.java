class Main {
  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
    spiral(matrix);

  }

  static void spiral(int[][] matrix) {
    int rowstart = 0;
    int rowend = matrix.length - 1;
    int colstart = 0;
    int colend = matrix[0].length - 1;
    while (rowstart <= rowend && colstart <= colend) {
      for (int i = colstart; i <= colend; i++) {
        System.out.print(matrix[rowstart][i] + " ");
      }
      rowstart++;
      for (int i = rowstart; i <= rowend; i++) {
        System.out.print(matrix[i][colend] + " ");
      }
      colend--;
      if (rowstart <= rowend) {
        for (int i = colend; i >= colstart; i--) {
          System.out.print(matrix[rowend][i] + " ");
        }
        rowend--;
        if (colstart <= colend) {
          for (int i = rowend; i >= rowstart; i--) {
            System.out.print(matrix[i][colstart] + " ");
          }
          colstart++;
        }
      }
    }

  }
}
