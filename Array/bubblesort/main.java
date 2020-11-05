class Main{
  public static void main(String[] args) {
    int arr[]={34,89,90,108,12};
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+",");
    }
    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-i-1;j++)
      {
        if(arr[j+1]<arr[j])
        {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }

    }
    System.out.println();
    System.out.println("sorted array..");
    for(int el:arr)
    {
      System.out.print(el+",");
    }

  }
}
