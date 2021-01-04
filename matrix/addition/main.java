class Main {
  public static void main(String[] args) {
    int[][] ar = { { 2, 5, 6, 1 }, { 12, 10, 0, 8 }, { 3, 11, 16, 10 } };
    int[][] arr = { { 12, 5, 8, 6 }, { 15, 1, 6, 0 }, { 11, 9, 3, 2 } };
    int[][] result = new int[ar.length][ar[0].length];
    for (int i = 0; i < ar.length; i++) {
      for (int j = 0; j < ar[0].length; j++) {
        result[i][j] = ar[i][j] + arr[i][j];
      }
    }
    for (int row = 0; row < result.length; row++) {
      for (int col = 0; col < result[0].length; col++) {
        System.out.print(result[row][col] + " ");
        

      }
      System.out.println();
    }
    
  }
}
