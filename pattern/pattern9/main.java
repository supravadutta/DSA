import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    int column = (2*num-1);
    int first = num-1;
    int last = num-1;
    for(int i =0;i<num;i++)
    {
      if(i!=num-1)
      {
        for(int j =0;j<column;j++)
        {
          if(j==first || j==last)
          {
            System.out.print("*");
            
          }
          else{
            System.out.print(" ");
          }
        }
        first--;
        last++;
        
        
      }
      else if(i==num-1)
        {
          for(int k=0;k<column;k++)
          {
            System.out.print("*");
          }
        }
        System.out.println();
    }
  }
}
