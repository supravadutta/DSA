import java.util.ArrayList;
import java.util.HashMap;

class Main{
  public static void main(String[] args) {
    ArrayList<Character> list = new ArrayList<>();
    String str = "aabapbcx";
    char[] arr = str.toCharArray();
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0;i<arr.length;i++)
    {
      if(map.containsKey(arr[i]))
      {
        map.put(arr[i], map.get(arr[i])+1);
      }
      else{
        map.put(arr[i],1);
      }
    }
    map.forEach((k,v)->{
      if(v==1)
      {
        list.add(k);
      }
    });
    System.out.println(list);
  }

}
