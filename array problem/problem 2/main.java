class Main{
  public static void main(String[] args) {
    int arr[]={12,11,7,10,5,14,8};
    int max=-1;
    int min=1000;
    for(int i=0;i<arr.length;i++)
    {
      int temp=arr[i]%arr.length;
      if(temp>max)
      {
        max=temp;
      }
      if(temp<min){
        min=temp;
      }
    }
    System.out.println("max remainder is.."+max);
    System.out.println("min remainder is.."+min);


  }
}
