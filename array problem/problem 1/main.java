class Main{
  public static void main(String[] args) {
    int arr[]={73,67,38,33,45,37};
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%5!=0)
      {
        int result=(arr[i]/5);
        result=result+1;
        result=result*5;
        if(result>=40){
          int diff=result-arr[i];
        arr[i]=(diff<3?result:arr[i]);
        }
      }

    }
    System.out.println("marks are..");
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
  }
}
