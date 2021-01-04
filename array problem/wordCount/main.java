import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String target = sc.nextLine();
    String[] arr = str.split(" ");
    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put(arr[i], 1);
      }

    }
    if (map.containsKey(target)) {
      System.out.println(map.get(target));
    } else {
      System.out.println("0");
    }
  }
}