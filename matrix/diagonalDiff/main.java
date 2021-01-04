class Main{
  public static void main(String[] args) {
    int[][]arr={
      {5,1,8},
      {2,2,5},
      {7,2,1}
    };
    int sum=0;
    int add=0;
    for(int i=0;i<arr.length;i++)
    {
      sum=sum+arr[i][i];
    }
    int row=0;
    int col=arr.length-1;
    for(int j=0;j<arr.length;j++)
    {
      add=add+arr[row][col];
      row++;
      col--;
    }
    int result=Math.abs(sum-add);
    System.out.println(result);
  }
}
