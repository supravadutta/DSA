import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
    String result = sc.next();
    System.out.println(IsSuffle(str1, str2, result));

  }

  static boolean IsSuffle(String str1, String str2, String result) {
    if (str1.length() + str2.length() != result.length()) {
      return false;
    } else {
      int i = 0;
      int j = 0;
      int k = 0;
      while (k != result.length()) {
        if (i < str1.length() && str1.charAt(i) == result.charAt(k)) {
          i++;
          k++;
        } else if (j < str2.length() && str2.charAt(j) == result.charAt(k)) {
          j++;
          k++;
        } else {
          return false;
        }
      }
      if (i < str1.length() || j < str2.length()) {
        return false;
      }
      return true;
    }
  }
}
