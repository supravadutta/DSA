import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String value = sc.nextLine();
    char[] arr = value.toCharArray();
    int miss_count = 0;
    int valid_count = 0;
    for (int i = 0; i < arr.length; i++) {
      Pattern ptrn = Pattern.compile("[^A-Za-z0-9 ]");
      Matcher match = ptrn.matcher(String.valueOf(arr[i]));
      if (match.find()) {
        miss_count++;

      } else {
        valid_count++;
      }

    }
    System.out.print(miss_count);
    System.out.println();
    System.out.print(valid_count);

  }
}
