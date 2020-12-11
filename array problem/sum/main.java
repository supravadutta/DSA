 class Main{
   public static void main(String[] args) {
     int arr[]={1,2,3,4};
     int sum=0;
     int product=1;
     int result;
     for(int i=0;i<arr.length;i++)
     {
       sum=sum+arr[i];

     }
     for(int j=0;j<arr.length;j++)
     {
       product=product*arr[j];
     }
     result=product-sum;
     System.out.println(result);
   }
 }
