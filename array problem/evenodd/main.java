class Main{
  public static void main(String[] args) {
    int arr[]={12,1,4,9,6,45,3};
    System.out.println("odd numbers..");
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%2!=0)
      {
        System.out.println(arr[i]);
      }
    }
    System.out.println("even numbers..");
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%2==0)
      {
        System.out.println(arr[i]);
      }
    }
  }
}
