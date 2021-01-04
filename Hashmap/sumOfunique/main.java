import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> result = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    int sum=0;
    int n= sc.nextInt();
    for(int i=0;i<n;i++)
    {
      int val=sc.nextInt();
      list.add(val);
    }
  
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<n;i++)
    {
      if(map.containsKey(list.get(i)))
      {
        map.put(list.get(i),map.get(list.get(i))+1);
      }
      else{
        map.put(list.get(i), 1);
      }
    }
    for(int key:map.keySet())
    {
      if (map.get(key)==1) {
        result.add(key);

        // sum=sum+key;
      }
    }
    int [] arr = new int[result.size()];
    for(int i=0;i<result.size();i++)
    {
      arr[i]=result.get(i);
    }

    System.out.println("..");
    for(int j=0;j<arr.length;j++)
    {
      System.out.println(arr[j]);
    }
  }
}
