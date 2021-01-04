class Main{
  public static void main(String[] args) {
    int[][]ar={
      {5,7,1,8},
      {8,10,9,6},
      {1,5,13,11}
    };

    int[][]arr={
      {4,3,2,8},
      {3,5,10,3},
      {5,4,11,13}
    };
    int[][] result = new int[ar.length][ar[0].length];
    for(int i=0;i<ar.length;i++)
    {
      for(int j=0;j<ar[0].length;j++)
      {
        result[i][j]=ar[i][j]-arr[i][j];
      }
    }
    for(int row=0;row<result.length;row++)
    {
      for(int col=0;col<result[0].length;col++)
      {
        System.out.print(result[row][col]+ " ");
      }
      System.out.println();
    }
  }
}
