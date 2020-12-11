import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer>list = new ArrayList<>();
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      int temp=sc.nextInt();
      list.add(temp);
    }
    String value=getString(list);
    System.out.println(value);
    
  }
  public static String getString(List<Integer>list)
  {
    String result = "";
     for(int i=0;i<list.size();i++)
     {
       if(list.get(i)%2!=0)
       {
         String temp = String.valueOf(list.get(i));
         temp='o'+temp;
         result=result+temp;
         if(i!=list.size()-1)
         {
           result=result+",";
         }
       }
       else{
         String temp = String.valueOf(list.get(i));
         temp='e'+temp;
         result=result+temp;
         if(i!=list.size()-1)
         {
           result=result+",";
         }
       }
     }
     return result;
  }
}
