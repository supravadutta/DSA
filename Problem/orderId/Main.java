import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 1;
    while (n != 0) {
      int rem = (n % 10);
      result = result * rem;
      n = n / 10;

    }
    System.out.println(result);
  }
}
