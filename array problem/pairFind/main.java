import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] arr = new int[num];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int pair = socksPair(arr);
    System.out.println(pair);
  }

  static int socksPair(int[] arr) {
    int sum = 0;

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put(arr[i], 1);
      }
    }

    for (int el : map.keySet()) {
      int val = (map.get(el) / 2);
      sum = sum + val;
    }

    return sum;
  }
}
