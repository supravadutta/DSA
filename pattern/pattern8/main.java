import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int space=0;
    int star=(2*num-1);
    for(int i =1;i<=num;i++)
    {
      for(int j =1;j<=space;j++)
      {
        System.out.print(" ");
      }
      for(int k =1;k<=star;k++)
      {
        System.out.print("*");
      }
      space=space+1;
      star=star-2;
      System.out.println();
    }
  }
}
