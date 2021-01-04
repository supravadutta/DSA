import java.util.*;
class Main{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   double base1 = sc.nextDouble();
   double height1 = sc.nextDouble();
   double base2 = sc.nextDouble();
   double height2 = sc.nextDouble();
   double area1=(base1*height1)/2;
   double area2=(base2*height2)/2;
  //  if(area1>area2)
  //  {
  //    System.out.println(area1+0.000000);
  //  }
  //  else{
  //    System.out.println(area2+0.000000);
  //  }
   double result=Math.max(area1,area2);
   System.out.println(result);
  }
}