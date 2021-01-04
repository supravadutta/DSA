import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> oddlist = new ArrayList<>();
    ArrayList<Integer> evenlist = new ArrayList<>();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++)
    {
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%2!=0)
      {
        oddlist.add(arr[i]);
      }
      else{
        evenlist.add(arr[i]);
      }
    }
    evenlist.addAll(oddlist);
    System.out.println(evenlist);
  }
}
