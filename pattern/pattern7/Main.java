import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int space=num-1;
    int star=1;
    for(int i =1;i<=num;i++)
    {
      for(int j=space;j>0;j--)
      {
        System.out.print(" ");
      }
      for(int k =1;k<=star;k++)
      {
        System.out.print(i);
      }
      space--;
      star=star+2;
      System.out.println();
    }

  }
}

