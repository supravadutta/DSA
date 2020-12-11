import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int target=sc.nextInt();
    String str = String.valueOf(num);
    char[] ch = str.toCharArray();
    HashMap<Character,Integer> map =new HashMap<>();
    for(int i=0;i<ch.length;i++)
    {
      if(map.containsKey(ch[i]))
      {
        map.put(ch[i], map.get(ch[i])+1);
      }
      else{
        map.put(ch[i], 1);
      }
    }
    char key = (char)(target + '0');
    if(map.containsKey(key))
    {
      System.out.println(map.get(key));
    }
    else{
      System.out.println("not found here..");
    }
    

    
  }
}
