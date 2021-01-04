import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int start = sc.nextInt();
    int end = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= start && arr[i] <= end) {
        list.add(i);
      }
    
    }
    if(list.size()==0)
    {
      System.out.println("-1");
    }
    else{
      System.out.println(list);
    }

  }
}
