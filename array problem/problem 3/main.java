class Main{
  public static void main(String[] args) {
    int arr[]={12,23,11,8,7,4};
    int max=-1;
    for(int i=0;i<arr.length-1;i++)
    {
      int diff=arr[i]-arr[i+1];
      if(diff>max)
      {
        max=diff;
      }
    }
    System.out.println(max);
  }
}
