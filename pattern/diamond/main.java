import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int first = num / 2 + 1;
    int last = num / 2 + 1;

    int n = num / 2 + 1;
    for (int row = 1; row <= num; row++) {

      if (row < n) {
        for (int col = 1; col <= num; col++) {
          if (col >= first && col <= last) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }

        first--;
        last++;
      } else if (row > n) {
        for (int col = 1; col <= num; col++) {
          if (col >= first && col <= last) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        first++;
        last--;

      } else if (row == n) {
        for (int col = 1; col <= num; col++) {
          System.out.print("*");
        }
        first++;
        last--;
      }
       System.out.println();
    }
  }
}
