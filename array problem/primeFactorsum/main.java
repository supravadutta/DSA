import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int value=sc.nextInt();
    int sum=0;
    for( int k=2;k<=value/2;k++)
    {
      if(value%k==0)
      {
        if(isPrime(k))
        {
          sum=sum+k;
        }
      }
    }
    System.out.println(sum);
    
  }
   static boolean isPrime( int n)
   {
     if(n==0 || n==1)
     {
       return false;
     }
     else{
       for(int i=2;i<=n/2;i++)
       {
         if(n%i==0)
         {
           return false;
         }
         

       }
       return true;
     }
   }
}
