import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size1=sc.nextInt();
    int size2=sc.nextInt();
    int n=sc.nextInt();
    int[]ar=new int[size1];
    int[]arr=new int[size2];
    for(int k=0;k<ar.length;k++)
    {
      ar[k]=sc.nextInt();
    }
    for(int p=0;p<arr.length;p++)
    {
      arr[p]=sc.nextInt();
    }
    int count1=0;
    int count2=0;
    for(int i=0;i<ar.length;i++)
    {
      if(ar[i]<n)
      {
        count1++;
      }
    }
    for(int j=0;j<arr.length;j++)
    {
      if(arr[j]>n)
      {
        count2++;
      }
    }
    if(count1>count2)
    {
      System.out.println(count1);
    }
    else{
      System.out.println(count2);
    }
  }
}
