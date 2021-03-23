import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int repeat=sc.nextInt();
    int n = sc.nextInt();
    int[]arr= new int[n];
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int j=0;j<repeat;j++)
    {
      int temp=arr[arr.length-1];
      for(int k=arr.length-1;k>=1;k--)
      {
        arr[k]=arr[k-1];
      }
      arr[0]=temp;
    }
    for(int el:arr)
    {
      System.out.print(el+ " ");
    }
  }
}
