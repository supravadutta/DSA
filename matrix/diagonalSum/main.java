class Main{
  public static void main(String[] args) {
    int[][] arr = {
      {5,1,8},
      {1,0,5},
      {7,1,6}
    };
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
      sum=sum+arr[i][i];
    }
    System.out.println(sum);
  }
}
