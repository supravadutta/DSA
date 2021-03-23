import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Practice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testcase = sc.nextInt();
    while (testcase != 0) {
      String str ="hi A# 12&";
      char[] arr = new char[str.length()];
      arr = str.toCharArray();
      int valid_count = 0;
      int miss_count = 0;
      for (char el : arr) {
        Pattern ptr = Pattern.compile("[A-Za-z0-9 ]");
        Matcher match = ptr.matcher(String.valueOf(el));
        if (match.find() && el!=' ') {
          valid_count++;
        } else {
          miss_count++;
        }
      }
      testcase--;
      System.out.print(valid_count);
      System.out.println();
      System.out.println(miss_count);

    }

  }
}
