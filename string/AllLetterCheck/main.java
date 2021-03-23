import java.util.*;

class Main {
  public static void main(String[] args) {
    String str = "The quick brown fox jumps over the lazy";
    str = str.toLowerCase();
    System.out.println(IsPangram(str));
  }

  static boolean IsPangram(String str) {
    char[] arr = str.toCharArray();
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != ' ') {
        if (map.containsKey(arr[i])) {
          map.put(arr[i], map.get(arr[i]) + 1);
        } else {
          map.put(arr[i], 1);
        }
      }
    }
    if (map.size() == 26) {
      return true;
    }
    return false;
  }
}
