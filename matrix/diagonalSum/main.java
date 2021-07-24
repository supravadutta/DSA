class Main{
  public static void main(String[] args) {
    int[][] arr = {
      {5,1,8},
      {1,0,5},
      {7,1,6}
    };
    int sum=0;
    int row=arr.length;
    int col=arr[0].length;
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        if(i==j)
        {
          sum=sum+arr[i][j];
        }
      }
    }
    int temp_row=0;
    int temp_col=col-1;
    int result=0;
    while(temp_row<row && temp_col>=0)
    {
      result=result+arr[temp_row][temp_col];
      temp_row++;
      temp_col--;
    }
    System.out.println(Math.abs(sum-result));

  }
}
