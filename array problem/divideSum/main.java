import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int value = sum(m, n);
    System.out.println(value);
  }

  static int sum(int m, int n) {
    int result = 0;
    for (int i = m; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        result = result + i;
      }
    }
    return result;
  }
}
