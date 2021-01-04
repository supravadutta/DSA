import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int initial = sc.nextInt();
    int rate = sc.nextInt();
    int N = sc.nextInt();
    int product = initial;
    for (int i = 0; i < N; i++) {
      if (i == 0) {
        System.out.println(product);
      } else {
        product = product * rate;
        System.out.println(product);
      }
    }
  }
}
