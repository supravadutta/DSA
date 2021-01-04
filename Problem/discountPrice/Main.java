import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int odd_sum = 0;
    int even_sum = 0;
    while (n != 0) {
      int rem = n % 10;
      if (rem % 2 == 0) {
        even_sum = even_sum + rem;
      } else {
        odd_sum = odd_sum + rem;
      }
      n = n / 10;
    }
    int result = (even_sum * odd_sum);
    System.out.println(result);
  }
}
