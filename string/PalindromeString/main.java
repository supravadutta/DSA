import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String reverse = "";
    char[] arr = str.toCharArray();
    for (int i = arr.length - 1; i >= 0; i--) {
      reverse = reverse + arr[i];
    }
    if (str.equals(reverse)) {
      System.out.println("palindrome string");
    }

  }
}
