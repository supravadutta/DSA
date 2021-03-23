class Main{
  public static void main(String[] args) {
    int num=6;
    int start=30;
    int end=50;
    int[]arr={29,38,12,48,39,55};
   for (int i=0;i<arr.length;i++)
   {
     if(arr[i]>=start && arr[i]<=end)
     {
       System.out.println(arr[i]);
     }
   }
  }
}
