import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int start = sc.nextInt();
    int end = sc.nextInt();
    int[] ar = new int[n];
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i<ar.length;i++)
    {
      ar[i] = sc.nextInt();
    }
    for(int j=0;j<ar.length;j++)
    {
      if( Math.abs(ar[j])>=start && Math.abs(ar[j])<=end)
      {
          list.add(ar[j]);
      }
    }
    System.out.println(list);
  }
}
