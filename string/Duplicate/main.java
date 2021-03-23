import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    ArrayList<Character> list = new ArrayList<>();
    char[] ch = str.toCharArray();
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < ch.length; i++) {
      if (map.containsKey(ch[i])) {
        map.put(ch[i], map.get(ch[i]) + 1);
      } else {
        map.put(ch[i], 1);
      }
    }
    for (char el : map.keySet()) {
      if (map.get(el) != 1) {
        list.add(el);
      }
    }
    System.out.println(list);
  }
}
