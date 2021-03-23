import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<arr.length-1;i++)
    {
      arr[i]=sc.nextInt();
    }
    HashMap<Integer,Integer>map =new HashMap<>();
    for(int i=0;i<arr.length-1;i++)
    {
      if(map.containsKey(arr[i]))
      {
        map.put(arr[i], map.get(arr[i])+1);
      }
      else{
        map.put(arr[i],1);
      }
    }
    for(int key:map.keySet())
    {
      if(map.get(key)==1)
      {
        System.out.println(arr[i]);
      }
    }
  }
}
