import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int digit = sc.nextInt();

    int evensum = 0;
    int oddsum = 0;

    while (digit != 0) {
      int rem = (digit % 10);
      if (rem % 2 == 0) {
        evensum = evensum + rem;
      } else {
        oddsum = oddsum + rem;
      }
      digit = digit / 10;

    }
    int diff = Math.abs(evensum - oddsum);
    System.out.println(diff);

  }
}
