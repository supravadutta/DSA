import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String value = show(str);
    System.out.println(value);
  }

  static String show(String str) {
    char[] arr = str.toCharArray();
    for (int i = 0; i < arr.length-1; i = i + 2) {
      char temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }
    String result = String.valueOf(arr);
    return result;
  }
}
