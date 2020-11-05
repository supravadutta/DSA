class Main{
  public static void main(String[] args) {
    int arr[]={120,5,1,8,12,56,7};
    System.out.println("array elements are..");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+",");
    }
    for(int i=0;i<arr.length-1;i++)
    {
      int min=i;
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[j]<arr[min]){
          min=j;
        }
      }
      int temp=arr[i];
    arr[i]=arr[min];
    arr[min]=temp;

    }
    System.out.println();
    System.out.println("sorted array..");
    for(int el:arr)
    {
      System.out.print(el +",");
    }
    
  }
}
