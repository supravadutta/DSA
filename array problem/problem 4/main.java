class Main{
  public static void main(String[] args) {
    int arr[]={23,12,3,2};
    int sum=0;
    for(int i=0;i<arr.length-1;i++)
    {
      int diff=(arr[i]-arr[i+1]);
      sum=sum+diff;
    }
    System.out.println(sum);
  }
}
