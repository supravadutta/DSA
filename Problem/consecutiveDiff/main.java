import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int min=1000;
    int[]arr= new int[n];
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int j=0;j<arr.length-2;j++)
    {
      int diff=Math.abs(arr[j]-arr[j+1]);
      if(diff<min)
      {
        min=diff;
      }
    }
    System.out.println(min);
  }
}
