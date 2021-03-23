class Main{
  public static void main(String[] args) {
    int[][]arr={
      {1,2,4,5},
      {3,4,7,8},
      {2,9,3,1}
    };
    for(int col=0;col<arr[0].length;col++)
    {
      for(int row=arr.length-1;row>=0;row--)
      {
        System.out.print( arr[row][col] + " ");
      }
      System.out.println();
    }
    
  }
}
