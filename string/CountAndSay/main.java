import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(CountSay(str));

  }

  static String CountSay(String str) {
    String result = "";
    char[] ch = str.toCharArray();
    char first = ch[0];
    int count = 1;
    for (int i = 1; i < ch.length; i++) {
      if (ch[i] == first) {
        count++;
      } else {
        result = result+String.valueOf(count)+first;
        first = ch[i];
        count = 1;
      }
    }
    result = result+String.valueOf(count)+first;
    return result;
  }

}
