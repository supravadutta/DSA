class Main{
  public static void main(String[] args) {
    int arr[]={4,3,2,10,12,1,5,6};
    System.out.println("array elements..");
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+ ",");
    }
    for(int i=1;i<arr.length;i++)
    {
      for(int j=i;j>0;j--){
        if(arr[j]>arr[j-1]){
          break;
        }
        else if(arr[j]<arr[j-1]){
          int temp=arr[j];
          arr[j]=arr[j-1];
          arr[j-1]=temp;
        }
      }
    }
    System.out.println();
    System.out.println("sorted array..");
    for(int el:arr)
    {
      System.out.print(el+ ",");
    }
  }
}
