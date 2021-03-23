import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int mid = num / 2 + 1;
    int start = mid;
    int end = mid;
    int first = 0;
    int second = 1;
    for (int row = 1; row <= num; row++) {
      int temp = start;
      if (row < mid) {
        for (int col = 1; col <= num; col++) {
          if (col == temp) {
            if (row == 1) {
              System.out.print(first);
            } else {
              System.out.print(second);
              int third = first + second;
              first = second;
              second = third;
            }

            if (temp < end) {
              temp = temp + 2;
            }
          } else {
            System.out.print(" ");
          }

        }
        start--;
        end++;
      } else if (row >= mid) {
        for (int col = 1; col <= num; col++) {
          if (col == temp) {
            System.out.print(second);
            int third = first + second;
            first = second;
            second = third;
            if (temp < end) {
              temp = temp + 2;
            }
          } else {
            System.out.print(" ");
          }
        }
        start++;
        end--;

      }
      System.out.println();
    }
  }
}
