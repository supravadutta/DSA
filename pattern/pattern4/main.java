import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i = 1; i < num + 1; i++) {
      for (int j = 1; j < num + 1; j++) {
        if (i == 1 || i == num || j == 1 || j == num) {
          System.out.print("*");
        } else {
          System.out.print(" ");

        }

      }
      System.out.println();
    }
  }
}
