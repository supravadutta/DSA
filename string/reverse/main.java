import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str=sc.next();
    char ch[]=str.toCharArray();
    String reverse="";
    for(int i=ch.length-1;i>=0;i--)
    {
      reverse=reverse+ch[i];
    }
    System.out.println(reverse);
  }
}