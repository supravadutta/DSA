import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if(number>=30 && number<=50)
    {
      System.out.println("D");
    }
    else if(number>=51 && number<=60)
    {
      System.out.println("C");
    }
    else if(number>=61 && number<=80)
    {
      System.out.println("B");
    }
    else if(number>=81 && number<=100)
    {
      System.out.println("A");
    }
  }
}
