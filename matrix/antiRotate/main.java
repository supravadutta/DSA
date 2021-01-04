class Main{
  public static void main(String[] args) {
    int[][]arr={
      {5,1,2,7},
      {1,2,5,3},
      {3,7,6,4}
    };
    int row_total=arr.length;
    int col_total=arr[0].length;
    for(int col=col_total-1;col>=0;col--)
    {
      for(int row=0;row<row_total;row++)
      {
        System.out.print(arr[row][col] + " ");
      }
      System.out.println();
    }
  }
}
