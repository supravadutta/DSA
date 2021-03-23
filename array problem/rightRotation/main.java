class Main{
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    int repeat=2;
    for(int i=0;i<repeat;i++)
    { 
      int last=arr[arr.length-1];
      for(int j=arr.length-2;j>=0;j--)
      {
        arr[j+1]=arr[j];

      }
      arr[0]=last;

    }
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
    
  }
}
