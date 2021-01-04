import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int column = (2*num-1);
    int first = 1;
    int last = column-2;
    for(int i = 0;i<num;i++)
    {
      if(i==0)
      {
        for(int j =0;j<column;j++)
        {
          System.out.print("*");
        }
      }
      else{
        for(int k = 0;k<column;k++)
        {
          if(k==first || k== last)
          {
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        
        }
        first++;
        last--;
    }
    System.out.println();
    
  }
}
}
