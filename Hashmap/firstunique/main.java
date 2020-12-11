import java.util.HashMap;

class Main{
  public static void main(String[] args) {
    String str="aacbcpbbx";
    char[] arr=str.toCharArray();
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0;i<arr.length;i++)
    {
      if(map.containsKey(arr[i]))
      {
        map.put(arr[i], map.get(arr[i])+1);
      }
      else{
        map.put(arr[i], 1);
      }

    }
    for(int j=0;j<arr.length;j++)
    {
      if(map.get(arr[j])==1)
      {
        System.out.println(arr[j]);
        break;
      }
      
    }
  }
}