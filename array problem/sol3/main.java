import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    boolean bOk = sc.nextBoolean();

    boolean result = inOrder(a, b, c, bOk);
    System.out.println(result);

  }

  public static boolean inOrder(int a, int b, int c, boolean bOk) {
    if (bOk == true) {
      if (c > b) {
        return true;
      } else {
        return false;
      }
    } else {
      if (b > a && c > b) {
        return true;
      } else {
        return false;
      }
    }

  }
}
