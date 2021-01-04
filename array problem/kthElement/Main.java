import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]ar = new int[n];
    for(int i=0;i<ar.length;i++)
    {
      ar[i]=sc.nextInt();
    }
    int k = sc.nextInt();
    Arrays.sort(ar);
    System.out.println(ar[k-1]);
  }
}
