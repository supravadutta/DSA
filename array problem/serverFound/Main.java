import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] ar=new int[size];
    for(int i=0;i<ar.length;i++)
    {
      ar[i]=sc.nextInt();
    }
    int sum=0;
    for(int j=0;j<ar.length;j=j+2)
    {
      sum=sum+ar[j];
    }
    System.out.println(sum);
  }
}
