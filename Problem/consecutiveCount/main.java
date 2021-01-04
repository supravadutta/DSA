import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count=0;
    int max=0;
    int[]arr = new int[n];
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int j=1;j<=arr.length-2;j++)
    {
      if(arr[j]==1)
      {
        count++;
        if(count>max)
        {
          max=count;
        }
      }
      else if(arr[j]==0)
      {
        count=0;
      }
    }
    System.out.println(max);
  }
}
