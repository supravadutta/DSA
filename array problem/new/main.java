class Main{
  public static void main(String[] args) {
    int arr[]={12,11,7,10,5,14,8};
    int evensum=0;
    int oddsum=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%2==0)
      {
        evensum=evensum+arr[i];
      }
      else{
        oddsum=oddsum+arr[i];
      }
    }
    int difference=evensum-oddsum;
    System.out.println(difference);
  }
}
