import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    while(n>0)
    {
      int RSB=(n&(-n));
      n=n-RSB;
      count++;
    }
    System.out.println(count);
  }
}
